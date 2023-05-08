package oopJava.src.mid;

import java.util.Scanner;

public class Lec2Ex7 {
    public static void main(String[] args) {
        int[] s = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n - 1; i++) {
            if(s[i - 1] < n && n < s[i]) {
                System.out.println(s[i-1] + " " + s[i]);
            }
        }
    }
}

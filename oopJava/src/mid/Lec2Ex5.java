package oopJava.src.mid;

import java.util.Scanner;

public class Lec2Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("반복 횟수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.close();

        double pi = 0;
        double sign = 1;
        for (int i = 0; i < n; i++) {
            pi += sign * 4.0 / (2 * i + 1);
            sign = -sign;
        }

        System.out.println("계산된 원주율 값: " + pi);
    }
}

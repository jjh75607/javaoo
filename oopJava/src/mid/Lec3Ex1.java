package oopJava.src.mid;

import java.util.Scanner;

public class Lec3Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if(n1 > n2) {
            System.out.println(n1);
        } else if(n1 < n2) {
            System.out.println(n2);
        } else {
            System.out.println("equals");
        }
    }
}

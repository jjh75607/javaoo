package oopJava.src.mid;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

    }
}

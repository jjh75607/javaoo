package oopJava.work;

import java.util.Scanner;

public class Midterm02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Positive Number : ");
            int n = scanner.nextInt();

            if(n < 1) {
                System.out.println("It is not a positive value.");
                continue;
            } else {
                System.out.println("The factors of " + n + " are :");
                for (int i = 1; i <= n; i++) {
                    if(n % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            }
        }
    }
}

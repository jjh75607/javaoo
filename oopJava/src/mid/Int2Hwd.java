package oopJava.src.mid;

import java.util.Scanner;

public class Int2Hwd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        switch (n) {
            case 0:
                System.out.println("영");
                break;
            case 1:
                System.out.println("하나");
                break;
            case 2:
                System.out.println("둘");
                break;
            default:
                System.out.println("없음");
        }
    }
}

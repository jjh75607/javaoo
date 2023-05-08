package oopJava.work;

import java.util.Scanner;

public class Midterm01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("width of square : ");
        int width = scanner.nextInt();
        System.out.print("height of square : ");
        int height = scanner.nextInt();

        double result = width * height;
        System.out.println("Arae of square : " + result);
        System.out.print("Length of square : " + (result + (height * 2)));
    }
}

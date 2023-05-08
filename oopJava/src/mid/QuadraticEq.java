package oopJava.src.mid;

import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 1.0;
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double result = Math.pow(b, 2) - (4 * a * c); // 제곱을 구하는 함수인 pow사용

        double r1 = ((-1 * b) + Math.sqrt(result)) / (2 * a);// 근의 공식 중 +-부분에 따른 루트 분리
        double r2 = ((-1 * b) - Math.sqrt(result)) / (2 * a);

        System.out.println("r1 = " + r1 + " r2 = " + r2);
    }
}

package oopJava.src.mid;

import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        //스캐너 선언
        Scanner scanner = new Scanner(System.in);

        //입력 받은 수를 저장할 변수 선언
        int n = scanner.nextInt();

        //3으로 나눈 나머지가 0일경우 3의 배수로 판단
        if(n % 3 == 0) {
            System.out.println("3의 배수입니다");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}

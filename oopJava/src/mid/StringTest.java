package oopJava.src.mid;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        //입력을 위한 scanner객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        //문자열 입력
        String address = scanner.next();

        System.out.println("charAt 2 " + address.charAt(2));
        System.out.println("compareTo " + address.compareTo("abc")); //사전적 순서로 문자열 비교 앞에있으면 -1, 같으면 0, 뒤에있으면 1
        System.out.println("concat " + address.concat("str")); // 문자열 더하기
        System.out.println("equals " + address.equals("wwas")); // 문자열 비교
        System.out.println("equalsIgnoreCase " + address.equalsIgnoreCase("wwas")); // 문자열 대소문자 무시 비교
        System.out.println("isEmpty " + address.isEmpty()); // 랭스가 0이면 true
        System.out.println("length " + address.length()); //길이

        //address 값이 quit 아닌동안 반복
        while(!address.equals("quit")) {
            //address안에 www로 시작되는지 확인
            if (address.startsWith("www")) {
                System.out.println(address + "은 'www'로 시작합니다.");
            } else {
                System.out.println(address + "은 'www'로 시작하지 않습니다.");
            }

            System.out.print("문자열을 입력하세요 : ");
            address = scanner.next();
        }
    }
}

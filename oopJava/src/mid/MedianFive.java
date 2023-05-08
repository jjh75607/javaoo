package oopJava.src.mid;

import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //5자리 int 배열 선언
        int[] arr = new int[5];

        //arr의 길이만큼 int형 입력 받음.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //정렬후, 0~4중 중간인 2번인덱스 출력
        Arrays.sort(arr);
        System.out.println(arr[2]);

    }
}

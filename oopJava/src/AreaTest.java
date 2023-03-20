import java.util.Scanner;

public class AreaTest {
    public static void main(String[] args) {
        final double PI = 3.141592; //상수로 PI를 지정

        Scanner scanner = new Scanner(System.in); //입력 받기 위한 Scanner클래스 선언
        double radius = scanner.nextDouble();// double 형으로 입력 받기
        double area = Math.pow(radius, 2) * PI;//Math.pow 함수는 제곱근을 구해는 함수이기에 사용하였습니다.

        System.out.println("반지름이" + radius + "인 원의 면적은" + area + "입니다.");
    }
}
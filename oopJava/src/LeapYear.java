import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        //윤년은 해당 년도를 4로나눈 나머지가 0이고, 400으로 나눈값이 0인것도 포함되는것 입니다.
        //100으로 나눈값이 0인 것은 윤년에서 제외하기 때문에 이렇게 짜게 되었습니다.
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
    }
}

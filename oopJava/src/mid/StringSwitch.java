package oopJava.src.mid;

import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();

        switch (month) {
            case "January":
            case "Jan":
                System.out.println("1");
                break;
            case "February":
            case "feb":
                System.out.println("2");
                break;
            case "March":
            case "marc":
                System.out.println("3");
                break;
            case "April":
            case "ap":
                System.out.println("4");
                break;
            default:
                System.out.println("바");
                break;
        }
    }
}

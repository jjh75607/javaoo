package oopJava.src.mid;

import java.util.Scanner;

public class ScoreSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}

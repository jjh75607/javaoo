package oopJava.work;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Midterm08 {
    static int i = 0;

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {1, 2},
                {1},
                {1, 2, 3}
        };
        Timer timer = new Timer(1000, event -> {
            if(i < a.length) {
                System.out.println(Arrays.toString(a[i++]));
            }
        });
        timer.start();
    }
}

package oopJava.src.mid;

import javax.swing.*;

interface My {
    void sayHello();
}

public class Lambda {
    public static void main(String[] args) {
        Timer t = new Timer(10, e -> System.out.println("B"));
        My my = ()-> System.out.println("hi");
    }
}

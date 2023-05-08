package oopJava.src.gimal;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("cal");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 300);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new TextField(10), BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 5));

        buttonPanel.add(new Button("BackSpace"));
        buttonPanel.add(new Button(""));
        buttonPanel.add(new Button(""));
        buttonPanel.add(new Button("CE"));
        buttonPanel.add(new Button("C"));
        buttonPanel.add(new Button("7"));
        buttonPanel.add(new Button("8"));
        buttonPanel.add(new Button("9"));
        buttonPanel.add(new Button("/"));
        buttonPanel.add(new Button("sqrt"));
        buttonPanel.add(new Button("4"));
        buttonPanel.add(new Button("5"));
        buttonPanel.add(new Button("6"));
        buttonPanel.add(new Button("*"));
        buttonPanel.add(new Button("%"));
        buttonPanel.add(new Button("1"));
        buttonPanel.add(new Button("2"));
        buttonPanel.add(new Button("3"));
        buttonPanel.add(new Button("-"));
        buttonPanel.add(new Button("1/x"));
        buttonPanel.add(new Button("0"));
        buttonPanel.add(new Button("+/-"));
        buttonPanel.add(new Button("."));
        buttonPanel.add(new Button("+"));
        buttonPanel.add(new Button("="));

        panel.add(buttonPanel, BorderLayout.CENTER);

        jFrame.add(panel);

        jFrame.pack();
        jFrame.setVisible(true);
    }
}

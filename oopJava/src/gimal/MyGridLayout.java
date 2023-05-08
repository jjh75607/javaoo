package oopJava.src.gimal;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout extends JFrame {
    public MyGridLayout() {
        setTitle("grid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 3));

        add(new JButton("b1"));
        add(new JButton("b2"));
        add(new JButton("b3"));
        add(new JButton("b4"));
        add(new JButton("b5"));

        pack();
        setVisible(true);
    }
}

package oopJava.src.gimal;

import javax.swing.*;
import java.awt.*;

public class MyFlowLayout extends JFrame {
    public MyFlowLayout() {
        setTitle("FlowLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add((new JButton("bu1")));
        panel.add((new JButton("bu2")));
        panel.add((new JButton("bu3")));
        panel.add((new JButton("b4")));
        panel.add((new JButton("long button 5")));
        add(panel);

        pack();
        setVisible(true);
    }
}

package oopJava.src.gimal;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayout extends JFrame {
    public MyBorderLayout() {
        setTitle("border la");
        setLayout(new BorderLayout());

        add(new Button("center"), BorderLayout.CENTER);
        add(new Button("line start"), BorderLayout.LINE_START);
        add(new Button("line end"), BorderLayout.LINE_END);
        add(new Button("page start"), BorderLayout.PAGE_START);
        add(new Button("page end"), BorderLayout.PAGE_END);

        pack();
        setVisible(true);
    }
}

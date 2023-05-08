package oopJava.src.mid;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyClass implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Beep");
    }
}

public class CallbackTest  {
    public static void main(String[] args) {
//        ActionListener listener = new MyClass();
//        Timer timer = new Timer(1000, listener);
        Timer timer = new Timer(1000, event -> System.out.println("beep"));
        timer.start();

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

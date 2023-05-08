package oopJava.work;

public class Test06 {
    public static void main(String[] args) {
        Midterm06 obj = new Midterm06();
        Flyable a = obj;
        Drivable b = obj;

        a.fly();
        b.drive();
    }
}

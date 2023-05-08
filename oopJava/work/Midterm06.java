package oopJava.work;

public class Midterm06 implements Flyable, Drivable{
    @Override
    public void drive() {
        System.out.println("I'm driving");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

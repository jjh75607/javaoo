package oopJava.work;

public class Midterm07 implements Animal{
    @Override
    public String walk() {
        return "걸을 수 있음, ";
    }

    @Override
    public String fly() {
        return "날 수 있음, ";
    }

    @Override
    public String sing() {
        return "노래할 수 있음.";
    }

    public String toString() {
        return "Bird는 " + walk() + fly() + sing();
    }
}

package oopJava.src.mid;

public class AutoCar implements OperateCar{
    @Override
    public void start() {
        System.out.println("go");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("change" + speed);
    }

    @Override
    public void turn(int degree) {
        System.out.println("angle " + degree);
    }
}

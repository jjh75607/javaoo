package oopJava.src.mid;

public class AutoCarTest {
    public static void main(String[] args) {
        OperateCar obj = new AutoCar();
        obj.start();
        obj.setSpeed(30);
        obj.turn(15);
        obj.stop();

        AutoCar autoCar = new AutoCar();
        autoCar.start();
        autoCar.stop();
    }
}

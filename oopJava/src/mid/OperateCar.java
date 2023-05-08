package oopJava.src.mid;

public interface OperateCar {
    void start();//정적 메소드도 가능
    default void stop() {
        System.out.println("일캐도 된다");
    }
    void setSpeed(int speed);
    void turn(int degree);
}

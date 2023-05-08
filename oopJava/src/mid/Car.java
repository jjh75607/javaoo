package oopJava.src.mid;
public class Car {
    String color;
    int gear;
    int speed;
    //매게변수로 받은 변수의 값으로 gear의 값 변경
    void changeGear(int n) {
        gear = n;
    }
    //스피드의 값 증가
    void speedUp() {
        speed++;
    }

    void speedDown() {
        speed--;
    }

}

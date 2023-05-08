package oopJava.src.mid;

public class CarTest {
    public static void main(String[] args) {
        //car 객체 생성
        Car car = new Car();
        car.color = "빨강";
        car.gear = 2;
        car.speed = 80;

        //초기 설정 값 출력
        System.out.println(car.toString());
        car.changeGear(3);
        car.speedUp();
        car.speedDown();
        car.speedDown();
        //값 변경 후 출력
        System.out.println(car.toString());
    }
}

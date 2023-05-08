package oopJava.work;

public class Test04 {
    public static void main(String[] args) {
        Midterm04 obj1 = new Midterm04("A3", "seoul");
        Midterm04 obj2 = new Midterm04("busan");
        Midterm04 obj3 = new Midterm04("A3", "china");

        int num = Midterm04.getNumberOfCars();
        Midterm04.showNumberOfCar();
    }
}

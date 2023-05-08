package oopJava.work;

public class Midterm04 {
    private String model;
    private String make;
    public static int numberOfCar;

    Midterm04(String model, String make) {
        this.model = model;
        this.make = make;
        numberOfCar++;
        System.out.printf("자동차 1대 생산, %s From : %s\n", this.model, this.make);
    }

    Midterm04(String make) {
        this.model = "A1";
        this.make = make;
        numberOfCar++;
        System.out.printf("자동차 1대 생산, %s From : %s\n", this.model, this.make);
    }

    public static int getNumberOfCars() {
        return numberOfCar;
    }

    public static void showNumberOfCar() {
        System.out.println("Num of Car : " + numberOfCar);
        System.out.println("누적 생사산량 : " + numberOfCar + "대");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}

package oopJava.work;

public class Test05 {
    public static void main(String[] args) {
        Midterm05[] obj = new Midterm05[2];
        obj[0] = new Dog();
        obj[1] = new Cat();

        for (int i = 0; i < 2; i++) {
            obj[i].sound();
        }

    }
}

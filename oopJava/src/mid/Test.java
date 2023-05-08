package oopJava.src.mid;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.de(100);
        b.w(60);
        b.ad();
        System.out.println(b.b);
    }
}

class B {
    int b;

    void de(int a) {
        b += a;
    }

    void w(int a) {
        if (b > 0) {
            b -= a;
        }
    }

    void ad() {
        b += (b * 3.5);
    }
}
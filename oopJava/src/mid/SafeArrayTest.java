package oopJava.src.mid;

public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray array = new SafeArray(3);

        for (int i = 0; i < (array.length); i++) {
            array.put(i, i * 10);
            System.out.println(array.get(i));
        }
    }
}

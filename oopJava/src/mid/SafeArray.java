package oopJava.src.mid;

public class SafeArray {
    private final int[] a;
    public int length;

    public SafeArray(int size) {
        a = new int[size];
        length = size;
    }

    public int get(int index) {
        if(index < length && index >= 0) {
            return a[index];
        }

        System.out.println("index out of range");
        return 0;
    }

    public void put(int index, int value) {
        if(index < length) {
            a[index] = value;
        } else {
            System.out.println("index out of range");
        }
    }
}

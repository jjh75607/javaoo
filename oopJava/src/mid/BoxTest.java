package oopJava.src.mid;

public class BoxTest {
    public static void main(String[] args) {
        Box obj1 = new Box(10, 20, 50);
        Box obj2 = new Box(10, 20, 30);

        Box largest = obj1.whoseLargest(obj1, obj2);
        System.out.println(largest.width + "," + largest.length  + "," + largest.height);
        System.out.println(obj1.isSameBox(obj2));
    }
}

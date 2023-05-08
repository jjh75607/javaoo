package oopJava.src.mid;

public class Box {
    int width, length, height;
    int volume;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.volume = width * length * height;
    }

    Box whoseLargest(Box box1, Box box2) {
        if(box1.volume > box2.volume) {
            return box1;
        } else {
            return box2;
        }
    }

    public boolean isSameBox(Box obj) {
        return this == obj;
    }

}

package oopJava.src.mid;

class Shape {
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

interface Drawable {
    void draw();
}

class Rectangle extends Shape implements Drawable{
    private int width, height;

    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }
}

class Triangle extends Shape {
    private int base, height;

    public Triangle(int x, int y) {
        super(x, y);
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int x, int y) {
        super(x, y);
    }
}

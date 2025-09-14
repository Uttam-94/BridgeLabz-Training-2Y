class Shape2 {
    public void draw() {
        System.out.println("Drawing shape...");
    }
}

class Circle2 extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
}

class Rectangle2 extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }
}

public class Q14 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();
    }
}

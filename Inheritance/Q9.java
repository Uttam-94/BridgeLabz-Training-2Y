abstract class Shape {
    public abstract void draw();

    public void info() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.info();
        s1.draw();
        s2.info();
        s2.draw();
    }
}

abstract class Vehicle5 {
    public abstract void move();
}

class Car5 extends Vehicle5 {
    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}

class Bike5 extends Vehicle5 {
    @Override
    public void move() {
        System.out.println("Bike is moving...");
    }
}

public class Q17 {
    public static void main(String[] args) {
        Vehicle5 v1 = new Car5();
        Vehicle5 v2 = new Bike5();
        v1.move();
        v2.move();
    }
}

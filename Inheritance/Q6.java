class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving...");
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving...");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.move();
    }
}

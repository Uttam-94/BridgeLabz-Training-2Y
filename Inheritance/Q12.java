class Vehicle2 {
    public void move() {
        System.out.println("Vehicle is moving...");
    }
}

class Car2 extends Vehicle2 {
}

public class Q12 {
    public static void main(String[] args) {
        Vehicle2 v = new Car2();
        v.move();
    }
}

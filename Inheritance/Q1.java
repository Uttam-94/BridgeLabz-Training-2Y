class Engine {
    public void start() {
        System.out.println("Engine starting...");
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println("Car is ready to go!");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}

class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.fly();
    }
}

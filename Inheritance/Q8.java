class Printer {
    public void print(String text) {
        System.out.println("Printing: " + text);
    }
}

class ColorPrinter extends Printer {
    @Override
    public void print(String text) {
        System.out.println("Printing in color: " + text);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Printer p = new ColorPrinter();
        p.print("Hello World");
    }
}

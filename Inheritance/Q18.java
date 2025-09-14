interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}

class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: " + amount);
    }
}

class ShoppingCart {
    private PaymentProcessor paymentProcessor;

    public ShoppingCart(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        paymentProcessor.processPayment(amount);
    }
}

public class Q18 {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart(new CreditCardProcessor());
        ShoppingCart cart2 = new ShoppingCart(new PayPalProcessor());

        cart1.checkout(100);
        cart2.checkout(200);
    }
}

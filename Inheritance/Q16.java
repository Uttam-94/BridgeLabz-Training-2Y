class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Invalid deposit");
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Invalid withdraw");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

class PremiumAccount extends BankAccount {
    private double fee;
    public PremiumAccount(double balance, double fee) {
        super(balance);
        this.fee = fee;
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + fee);
    }
    public void applyInterest(double rate) {
        if (rate < 0) throw new IllegalArgumentException("Invalid rate");
        double interest = getBalance() * rate;
        deposit(interest);
    }
}

public class Q16 {
    public static void main(String[] args) {
        try {
            testBankAccountBehavior();
            testPremiumAccountPolymorphism();
            testPremiumAccountDoesNotAffectBankAccount();
            testApplyInterest();
            testInvalidDepositThrows();
            System.out.println("All tests passed");
        } catch (AssertionError e) {
            System.err.println("Test failed: " + e.getMessage());
            System.exit(1);
        }
    }

    static void testBankAccountBehavior() {
        BankAccount ba = new BankAccount(1000);
        ba.deposit(500);
        assertEquals(1500.0, ba.getBalance());
        ba.withdraw(200);
        assertEquals(1300.0, ba.getBalance());
        assertThrows(IllegalArgumentException.class, () -> ba.withdraw(2000));
    }

    static void testPremiumAccountPolymorphism() {
        BankAccount pa = new PremiumAccount(1000, 5.0);
        pa.deposit(200);
        assertEquals(1200.0, pa.getBalance());
        pa.withdraw(100);
        assertEquals(1095.0, pa.getBalance());
    }

    static void testPremiumAccountDoesNotAffectBankAccount() {
        BankAccount ba2 = new BankAccount(1000);
        ba2.withdraw(100);
        assertEquals(900.0, ba2.getBalance());
    }

    static void testApplyInterest() {
        PremiumAccount pa2 = new PremiumAccount(1000, 2.0);
        pa2.applyInterest(0.1);
        assertEquals(1100.0, pa2.getBalance());
    }

    static void testInvalidDepositThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            BankAccount ba = new BankAccount(0);
            ba.deposit(-10);
        });
    }

    static void assertEquals(double expected, double actual) {
        double eps = 1e-9;
        if (Math.abs(expected - actual) > eps) throw new AssertionError("Expected: " + expected + " Actual: " + actual);
    }

    static void assertThrows(Class<? extends Throwable> expected, Runnable action) {
        try {
            action.run();
            throw new AssertionError("Expected exception: " + expected.getName());
        } catch (Throwable t) {
            if (!expected.isInstance(t)) throw new AssertionError("Expected " + expected.getName() + " but got " + t.getClass().getName());
        }
    }
}

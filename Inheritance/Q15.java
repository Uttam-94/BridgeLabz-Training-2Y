class Account2 {
    public double calculateInterest(double balance) {
        return balance * 0.05;
    }
}

class SavingsAccount2 extends Account2 {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.07;
    }
}

public class Q15 {
    public static void main(String[] args) {
        Account2 a1 = new Account2();
        Account2 a2 = new SavingsAccount2();
        System.out.println("Account interest: " + a1.calculateInterest(1000));
        System.out.println("Savings interest: " + a2.calculateInterest(1000));
    }
}

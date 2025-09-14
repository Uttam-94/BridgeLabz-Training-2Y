class Account {
    public final void deposit(double amount) {
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        System.out.println("Withdrew: " + amount);
    }
}

class SavingsAccount extends Account {
    @Override
    public void withdraw(double amount) {
        System.out.println("SavingsAccount withdraw: " + amount);
    }
}

public class Q5 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1000);
        sa.withdraw(500);
    }
}

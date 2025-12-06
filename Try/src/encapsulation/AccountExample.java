package src.encapsulation;

public class AccountExample {
    static class Account {
        private double balance; // encapsulated field

        public Account(double initial) { this.balance = initial; }

        public double getBalance() { return balance; }

        public void deposit(double amt) {
            if (amt > 0) balance += amt;
        }

        public boolean withdraw(double amt) {
            if (amt > 0 && amt <= balance) {
                balance -= amt;
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Account acc = new Account(50.0);
        acc.deposit(25.0);
        boolean ok = acc.withdraw(30.0);
        System.out.println("Withdraw successful: " + ok);
        System.out.println("Final balance: " + acc.getBalance());
    }
}

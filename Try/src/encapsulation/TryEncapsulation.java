package src.encapsulation;

class TryEncapsulation {
    private double balance; // Hidden data

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) { // Controlled access
        if(amount > 0)
            balance += amount;
    }


    public void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
    }
}
class Balance{
    public static void main(String[] args) {
        TryEncapsulation account = new TryEncapsulation();
        account.deposit(10000);
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());
    }
}

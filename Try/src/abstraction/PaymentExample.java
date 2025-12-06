package src.abstraction;

public class PaymentExample {
    static abstract class Payment {
        double amount;
        Payment(double amount) { this.amount = amount; }
        abstract void pay();
    }

    static class CreditCardPayment extends Payment {
        CreditCardPayment(double amount) { super(amount); }
        void pay() {
            System.out.println("Paying " + amount + " using Credit Card");
        }
    }

    static class CashPayment extends Payment {
        CashPayment(double amount) { super(amount); }
        void pay() {
            System.out.println("Paying " + amount + " in Cash");
        }
    }

    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(100.0);
        Payment p2 = new CashPayment(50.0);
        p1.pay();
        p2.pay();
    }
}


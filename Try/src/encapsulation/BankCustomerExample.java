package src.encapsulation;

public class BankCustomerExample {
    static class Customer {
        private String id;
        private String name;

        public Customer(String id, String name) {
            this.id = id;
            this.name = name;
        }

        // only getter for id to prevent external modification
        public String getId() { return id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    public static void main(String[] args) {
        Customer c = new Customer("C001", "Ravi");
        System.out.println("Customer id: " + c.getId());
        System.out.println("Customer name: " + c.getName());
        c.setName("Ravi Kumar");
        System.out.println("Updated name: " + c.getName());
    }
}


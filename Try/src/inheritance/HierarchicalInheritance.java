package src.inheritance;

public class HierarchicalInheritance {
    static class Device {
        void start() { System.out.println("Device starting"); }
    }
    static class Phone extends Device {
        void call() { System.out.println("Phone calling"); }
    }
    static class Laptop extends Device {
        void compile() { System.out.println("Laptop compiling"); }
    }

    public static void main(String[] args) {
        Phone p = new Phone();
        Laptop l = new Laptop();
        p.start(); p.call();
        l.start(); l.compile();

    }
}


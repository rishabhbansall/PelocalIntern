package src.polymorphism;

public class InterfacePolymorphism {
    interface Printer { void print(String msg); }

    static class ConsolePrinter implements Printer {
        public void print(String msg) { System.out.println("Console: " + msg); }
    }

    static class SilentPrinter implements Printer {
        public void print(String msg) { /* do nothing */ }
    }

    public static void main(String[] args) {
        Printer p1 = new ConsolePrinter();
        Printer p2 = new SilentPrinter();
        p1.print("Hello World");
        p2.print("This will not show");
    }
}


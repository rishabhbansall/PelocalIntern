package src.polymorphism;

public class OverloadingExample {
    static class MathOps {
        int sum(int a, int b) { return a + b; }
        double sum(double a, double b) { return a + b; }
        int sum(int a, int b, int c) { return a + b + c; }
    }

    public static void main(String[] args) {
        MathOps m = new MathOps();
        System.out.println(m.sum(2, 3));
        System.out.println(m.sum(1.5, 2.5));
        System.out.println(m.sum(1, 2, 3));
    }
}


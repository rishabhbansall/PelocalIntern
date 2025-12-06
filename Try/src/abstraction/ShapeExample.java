package src.abstraction;

public class ShapeExample {
    static abstract class Shape {
        abstract void draw();
    }

    static class Circle extends Shape {
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    static class Rectangle extends Shape {
        void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();
    }
}


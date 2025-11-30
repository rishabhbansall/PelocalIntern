package src.abstraction;

public class Abstaction {
    abstract static class Shape {
        abstract void draw(); // No implementation
    }

    static class Circle extends Shape {
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }

}

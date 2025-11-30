package src.polymorphism;

public class OverridingExample {
    static class Animal {
        void sound() { System.out.println("Some generic sound"); }
    }
    static class Dog extends Animal {
        @Override
        void sound() { System.out.println("Dog: Bark"); }
    }
    static class Cat extends Animal {
        @Override
        void sound() { System.out.println("Cat: Meow"); }
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}


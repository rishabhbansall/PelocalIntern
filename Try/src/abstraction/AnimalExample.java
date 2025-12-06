package src.abstraction;

public class AnimalExample {
    static abstract class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        void makeSound() { System.out.println("Dog: Bark"); }
    }

    static class Cat extends Animal {
        void makeSound() { System.out.println("Cat: Meow"); }
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound();
        a2.makeSound();
    }
}


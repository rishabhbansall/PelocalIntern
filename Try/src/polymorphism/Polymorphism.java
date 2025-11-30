package src.polymorphism;

public class Polymorphism {
    static class Maths{
        int add(int a,int b){
            return a+b;
        }
        double add(double a,double b){
            return a+b;
        }
    }
    public static class Overloading{
        public static void main(String[] args){
            Maths m=new Maths();
            System.out.println(m.add(5,10));
            System.out.println(m.add(5.5,10.5));
        }
    }


    static class Animal{
        void sound(){
            System.out.println("Some sound");
        }
    }
    static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Bark");
        }
    }
    static class Cat extends Animal{
        @Override
        void sound(){
            System.out.println("Meow");
        }
    }
    public static class Overriding {
        public static void main(String[] args){
            Animal a=new Dog();
            Animal d=new Cat();
            a.sound();
            d.sound();
        }
    }
}

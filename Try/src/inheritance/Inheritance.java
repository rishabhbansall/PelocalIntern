package src.inheritance;
class Inheritance {
    void start(){
        System.out.println("Vehicle Start");
    }
}
class Car extends Inheritance{
    void changeGear(){
        System.out.println("Car Gear Changed");
    }
}
class TestInheritance{
    public static void main(String[] args){
        Car c=new Car();
        c.start();
        c.changeGear();
    }

}
//promotes code reusability
//parent child relationship

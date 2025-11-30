package src.inheritance;

public class MultilevelInheritance {
    static class Grandparent {
        void showGrandparent() { System.out.println("I am grandparent"); }
    }
    static class Parent extends Grandparent {
        void showParent() { System.out.println("I am parent"); }
    }
    static class Child extends Parent {
        void showChild() { System.out.println("I am child"); }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.showGrandparent();
        c.showParent();
        c.showChild();
    }
}


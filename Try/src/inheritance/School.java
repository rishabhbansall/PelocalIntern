package src.inheritance;

public class School {
    void Class(){
        System.out.println("This is school");
    }
}
class ClassDemo extends School{
    void Section(){
        System.out.println("This is section A");
    }
}
class InheritanceDemo{
    public static void main(String[] arg){
        ClassDemo cd= new ClassDemo();
        cd.Class();
        cd.Section();
    }
}

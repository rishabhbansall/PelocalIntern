public class Employee {
    int id;
    String name;
    String desg;
    int Salary;

    public Employee(int id, String name, String desg, int Salary){
        this.id = id;
        this.name = name;
        this.desg = desg;
        this.Salary = Salary;

    }
    public static void main(String[] args){
        Employee emp1=new Employee(1,"rishabh","intern",20000);
        Employee emp2=new Employee(2,"rahul","junior developer",40000);
        Employee emp3=new Employee(3,"rohan","senior developer",80000);
        Employee emp4=new Employee(4,"raj","manager",100000);
        System.out.println("Employee id : "+emp1.id);
        System.out.println(emp2.name);
        System.out.println(emp3.desg);
        System.out.println(emp4.Salary);
    }

}

import java.util.Scanner;

public class calculator {
    double income;
    double expense;
    public double left(double income,double expense){
        return income-expense;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter income");
        double income=sc.nextDouble();
        System.out.println("enter expanse");
        double expense=sc.nextDouble();
        calculator calc=new calculator();
        double leftAmount=calc.left(income, expense);
        System.out.println("Amount left after expense: "+leftAmount);

    }
}

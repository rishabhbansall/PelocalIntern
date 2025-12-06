package pelocal.day2;

import java.util.Scanner;

public class PolicyDetails {
    public int id;
    public String name;
    public String todayDate;

    public String getPolicyDetails(int id ,String name,String todayDate){
        return "Policy Details -> "+"id : "+id+" "+", name : "+name+" "+", todayDate : "+todayDate;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        int id =sc.nextInt();
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("enter today date");
        String todayDate=sc.next();
        PolicyDetails policy=new PolicyDetails();
        String pd=policy.getPolicyDetails(id,name,todayDate);
        System.out.println(pd);
    }
}

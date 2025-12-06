//package pelocal.day2;
//
//import java.util.Scanner;
//
//public class Aadhar {
//    public int id;
//    public String name;
//    public Address address;
//
//    public Aadhar(int id,String name,Address address){
//        this.id=id;
//        this.name=name;
//        this.address=address;
//    }
//    public String AadharDetails(int id,String name,Address address){
//        return "Aadhar details of the person is -> "+"id : "+id+" name : "+name+" address : "+address;
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter id");
//        int id=sc.nextInt();
//        System.out.println("Enter name");
//        String name=sc.next();
////        System.out.println("Enter address");
////        String address=sc.next();
//        Aadhar aadhar=new Aadhar(id,name,address);
//        String ad=aadhar.AadharDetails(id,name,address);
//        System.out.println(ad);
//    }
//}


package pelocal.day2;

import java.util.Scanner;

public class Aadhar {
    public int id;
    public String name;
    public Address address;

    public Aadhar(int id,String name,Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Keep method same style with parameters removed
    public String AadharDetails(){
        return "Aadhar details of the person is -> " + "id : " + id + " name : " + name + " address : " + address.AddressDetails();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter id");
        int id = sc.nextInt();
        sc.nextLine(); // to avoid input skip

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter street :");
        String street =sc.next();

        System.out.println("Enter city :");
        String city = sc.next();

        System.out.println("Enter state:");
        String state = sc.nextLine();

        System.out.println("Enter zipcode:");
        int zipcode = sc.nextInt();

        Address address = new Address(street, city, state, zipcode);

        Aadhar aadhar = new Aadhar(id, name, address);

        // NO parameters here now
        String ad = aadhar.AadharDetails();
        System.out.println(ad);
    }
}

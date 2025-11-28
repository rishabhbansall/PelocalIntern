package pelocal.day2;

import java.util.Scanner;

public class Address {
    public String street;
    public String city;
    public String state;
    public int zipcode;

    public Address(String street,String city,String state,int zipcode){
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
    }
    public String AddressDetails(){
        return "Address Details are : "+street+", "+city+", "+state+", "+zipcode;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter street:");
        String street=sc.nextLine();
        System.out.println("Enter city:");
        String city=sc.nextLine();
        System.out.println("Enter state:");
        String state=sc.nextLine();
        System.out.println("Enter zipcode:");
        int zipcode=sc.nextInt();

        Address address=new Address(street,city,state,zipcode);
        String addressDetails=address.AddressDetails();
        System.out.println(addressDetails);
    }

}

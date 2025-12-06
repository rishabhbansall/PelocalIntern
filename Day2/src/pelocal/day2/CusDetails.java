package pelocal.day2;

public class CusDetails {
    public int id;
    public String name;
    public long mobileNumber;

    public CusDetails(int id,String name,long mobileNumber){
        this.id=id;
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
    public static void main(String[] args){
        CusDetails cus1=new CusDetails(1,"Rishabh",98710);
        System.out.println("Customer Id : "+cus1.id);
        CusDetails cus2=new CusDetails(2,"Rahul",98767);
        System.out.println("Customer Name : "+cus2.name);
        CusDetails cus3=new CusDetails(3,"Rohan",345678);
        System.out.println("Customer Mobile Number : "+cus3.mobileNumber);
        CusDetails cus4=new CusDetails(4,"Ritesh",98765);
        System.out.println("Customer Details : "+cus4.id+" "+cus4.name+" "+cus4.mobileNumber);
    }
}

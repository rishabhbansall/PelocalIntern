public class Hello {
    public int a;
    public int b;

    public Hello(int a,int b){
        this.a=a;
        this.b=b;
    }

    public Hello(){}

    public int add(){
        return a+b;
    }

    public static void main(String[] args){
        Hello h=new Hello(15,25);
        System.out.println("Sum: "+h.add());
    }
}

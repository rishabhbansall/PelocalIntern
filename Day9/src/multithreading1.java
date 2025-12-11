//public class multithreading1 extends Thread {
//    @Override
//    public void run() {
//        for (int i=0;i<=100;i++) {
//            if (i%2==0) {
//                System.out.print(i);
//            }
//            System.out.print(" ");
//        }
//    }
//    public static void main(String[] args){
//        multithreading1 multi=new multithreading1();
//        multi.start();
//    }
//}
//
//

import java.util.*;
public class multithreading1{
    static class NumberPrinter implements Runnable{
        private final int start;
        private final int max;
        private final int step;

        NumberPrinter(int start,int max,int step){
            this.start=start;
            this.max=max;
            this.step=step;
        }
        @Override
        public void run(){
            for (int i=start;i<=max;i+=step){
                synchronized (System.out){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread even=new Thread(new NumberPrinter(0,100,2));
        Thread odd=new Thread(new NumberPrinter(1,100,2));
        even.start();
        odd.start();
        even.join();
        odd.join();
        System.out.println();
    }
}
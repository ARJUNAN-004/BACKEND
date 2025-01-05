//Write a Java program to demonstrate object-level and method-level locking using multithreading. The program should:
//Create a shared resource class (e.g., SharedPrinter) with two synchronized methods:
//Method 1: Print a given string multiple times.
//Method 2: Print a countdown from a given number.
//Use two threads:
//Thread 1: Calls the first synchronized method (print string).
//Thread 2: Calls the second synchronized method (countdown).
//Demonstrate the difference between:
//Object-Level Locking: When both threads use the same instance of the shared resource.
//Class-Level Locking: When both threads use a static synchronized method or block.
//Show how the locks affect the execution order of the methods.

package DAY07.Locking;

class SharedPrinter1{
    static synchronized void Strmultiple1(String s,int n){
        for (int i=0;i<n;i++){
            System.out.println("String ="+s);
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println("Str Error ");
            }
        }
    }
    static synchronized void Countdowm1(int Count){
        for (int i=1;i<=Count;i++){
            System.out.println("Count ="+i);
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println("Count Error ");
            }
        }
    }
}
public class Method {
    public static void main(String[] args) {
        SharedPrinter1 sp=new SharedPrinter1();
        long srt=System.currentTimeMillis();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                sp.Strmultiple1("Hlo",5);
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                sp.Countdowm1(5);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch (Exception e){
            System.out.println("Error in object");
        }
        long end=System.currentTimeMillis();
        System.out.println("Execute Time of Method = "+(end-srt));
    }
}

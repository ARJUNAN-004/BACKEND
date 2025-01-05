//Write a Java program to demonstrate the use of multithreading. The program should:
//Create two threads:
//Thread 1: Print numbers from 1 to 10 with a 500ms delay between each number.
//Thread 2: Print the square of numbers from 1 to 10 with a 700ms delay between each number.
//Ensure both threads run concurrently.
//Use Thread class or Runnable interface for thread implementation.

package DAY07.Threads;

class nums extends Thread{
    public void run() {
        try{
            for(int i=1;i<=10;i++){
                System.out.println("Thread 1 = "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1 End");
        }
    }
}
class squares implements Runnable{

    @Override
    public void run() {
        try{
            for(int i=1;i<=10;i++){
                System.out.println("Thread 2 = "+(i*i));
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 End");
        }

    }
}
public class ThreadExample {
    public static void main(String[] args) {
        Thread t1=new nums();
        Thread t2=new Thread(new squares());
        t1.start();
        t2.start();

    }
}

//Write a program with a class Counter that has a static variable to count the number of objects created. Create three objects and print the count using a static method.

package DAY03.Static.StaticVariableandMethods;

public class Counter {
    static int count;
    public Counter(int n){
        count++;
    }
    public static void main(String[] args) {
        Counter c1=new Counter(1);
        Counter c2=new Counter(2);
        Counter c3=new Counter(3);
        System.out.println("Count = "+count);
    }
}

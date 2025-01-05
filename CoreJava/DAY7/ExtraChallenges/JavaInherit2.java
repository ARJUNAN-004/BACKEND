//Write the following code in your editor below:
//
//A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
//A class named Adder that inherits from a superclass named Arithmetic.
//Your classes should not be public .
//You are not responsible for reading any input from stdin;

//Sample Output
//My superclass is: Arithmetic
//42 13 20
package DAY07.ExtraChallenges;

class Arithmetic{
    public int add(int a,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{
}
public class JavaInherit2{
    public static void main(String []args){
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}

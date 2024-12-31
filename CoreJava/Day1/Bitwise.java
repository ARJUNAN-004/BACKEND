//Implement a program that shifts an integer left and right by 2 positions and prints the result.
//Use the ^ operator to demonstrate XOR functionality between two integers.

package DAY01;

public class Bitwise {
    public static void main(String[]args){
        int n1=10;
        int n2=2;
        System.out.println("BITWISE OR="+(n1|n2));
        System.out.println("BITWISE AND="+(n1&n2));
        System.out.println("BITWISE XOR="+(n1^n2));
        System.out.println("LEFTSHIFT="+(n1<<n2));
        System.out.println("RIGHTSHIFT="+(n1>>n2));
    }
}

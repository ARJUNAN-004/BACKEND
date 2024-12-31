//Write a program to swap two numbers without using a third variable (use XOR).

package DAY02.Operators.Bitwise;

import java.util.Scanner;

public class SwapUsingXOR {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1=");
        int n1= sc.nextInt();
        System.out.println("Enter n2=");
        int n2=sc.nextInt();
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("n1="+n1);
        System.out.println("n2="+n2);
    }
}

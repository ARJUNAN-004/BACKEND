//Write a program to find the factorial of a number using loops and arithmetic operators.

package DAY02.Operators.ArithmrticAndLogical;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int n1=0,n2=1;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for (int i=0;i<n-2;i++){
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}

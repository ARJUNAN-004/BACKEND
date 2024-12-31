//Write a program that takes two integers from the user and performs all arithmetic operations, printing each result.

package DAY01;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1=");
        int n1= sc.nextInt();
        System.out.println("Enter n2=");
        int n2= sc.nextInt();
        System.out.println("n1+n2="+(n1+n2));
        System.out.println("n1-n2="+(n1-n2));
        System.out.println("n1*n2="+(n1*n2));
        System.out.println("n1/n2="+(n1/n2));
        System.out.println("n1%n2="+(n1%n2));
    }
}

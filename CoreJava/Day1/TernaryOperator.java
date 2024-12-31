//Write a program that reads an integer and prints "Even" if it is even, or "Odd" if it is odd, using a ternary operator.

package DAY01;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String res=(n%2==0)?"even":"odd";
        System.out.println(res);
    }
}

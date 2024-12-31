//Create a program to find the count of 1s in the binary representation of a number.

package DAY02.Operators.Ternary;

import java.util.Scanner;

public class LargestNumTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println("Largest num= "+n);
    }
}

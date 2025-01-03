//2) Write a program that:
//Takes two strings as input from the user.
//Compares them lexicographically using compareTo() method.
//Checks if the two strings are equal (case-sensitive and case-insensitive).
//Concatenates the two strings and prints the result.

package DAY06.Strings;

import java.util.Scanner;

public class BasicString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("Compare = "+(s1.compareTo(s2)));
        System.out.println("Equal Case Sensitive = "+(s1.equals(s2)));
        System.out.println("Equal Case Insensitive = "+(s1.equalsIgnoreCase(s2)));
        System.out.println("Concat  = "+(s1+s2));
    }
}
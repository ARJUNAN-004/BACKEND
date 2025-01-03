//1) Write a program that takes a sentence as input from the user and performs the following operations:
//Count the number of words in the sentence.
//Reverse the entire sentence.
//Replace all vowels in the sentence with the character '*'.

package DAY06.Strings;

import java.util.Scanner;

public class BasicString1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]ss=s.split(" ");
        System.out.println(ss.length);
        for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        s=s.replaceAll("[AEIOUaeiou]","*");
        System.out.println("\nAfter Replace = "+s);
    }
}

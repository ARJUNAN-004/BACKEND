//Create a program to reverse a given number.

package DAY02.ProgramControl.Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0,temp=0;
        while (n>0){
            temp=n%10;
            num=num*10+temp;
            n/=10;
        }
        System.out.println(num);
    }
}

//Write a program to demonstrate the use of the following java.lang classes:
//Math - Perform basic mathematical operations like finding the square root, power, and maximum of two numbers.
//String - Manipulate a string by finding its length, converting it to uppercase, and extracting a substring.
//System - Print a message to the console and measure the execution time of a simple loop using System.currentTimeMillis().

package DAY06.Langobjj;
public class BasicOfLang {
    public static void main(String[] args) {
        int n=5,m=10;
        String s="Hello World";
        System.out.println("--Math--\n");
        System.out.println("Square root of  "+m+" is "+Math.sqrt(m)+" and "+n+" is "+Math.sqrt(n));
        System.out.println("Power of "+m+" is "+Math.pow(m,2)+" and "+n+" is "+Math.pow(n,2));
        System.out.println("Maximun  of "+m+" and "+n+" = "+Math.max(m,n));
        System.out.println("--String--\n");
        System.out.println("Length of String = "+s.length());
        System.out.println("UpperCase of String = "+s.toUpperCase());
        System.out.println("Substring of The String = "+s.substring(0,5));

        System.out.println("--calculate time--\n");
        int sum=0;
        System.out.println("Before Loop = "+System.currentTimeMillis());
        for (int i=0;i<10;i++){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("After Loop = "+System.currentTimeMillis());
    }
}

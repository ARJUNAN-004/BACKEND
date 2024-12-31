
//Create a program that reads two integers and prints whether the first number is greater than the second using relational operators.
//Use logical operators to combine multiple conditions.

package DAY01;

public class LogicalRelational {
    public static void main(String[]args){
        int n1=10;
        int n2=20;
        int n3=30;
        System.out.println(n1>n2);
        if((n2>n1)&&(n2<n3)){
            System.out.println("LOGICAL AND");
        }
        if ((n1>n2)||(n3>n1)){
            System.out.println("LOGICAL OR");
        }
    }
}

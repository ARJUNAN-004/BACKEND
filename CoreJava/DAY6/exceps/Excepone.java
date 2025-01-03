//Write a program that:
//Accepts two integers from the user as input.
//Attempts to divide the first integer by the second.
//Implements exception handling to manage the following scenarios:
//Division by zero: Display an error message "Error: Division by zero is not allowed.".
//Invalid input: Display an error message "Error: Please enter valid integers.".
//Any other exceptions: Display "An unexpected error occurred.".

package DAY06.exceps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        try {
            double n3=n1/n2;
            System.out.println("Divided = "+n3);
        }
        catch (ArithmeticException e){
            System.out.println( "Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException i){
            System.out.println("Error: Please enter valid integers.");
        }
        catch (Exception ex){
            System.out.println("An unexpected error occurred.");
        }
    }
}

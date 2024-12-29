package DAY02;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1=");
        int num1=sc.nextInt();
        System.out.println("Enter num2=");
        int num2=sc.nextInt();
        System.out.println("Choose the operator to perform\n1)Addition\n2)Subtract\n3)Multiply\n4)Division\n5)Mod");
        int opt= sc.nextInt();
        switch (opt){
            case 1:
                System.out.println("Addition= "+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction= "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiply= "+(num1*num2));
                break;
            case 4:
                System.out.println("Division= "+(num1/num2));
                break;
            case 5:
                System.out.println("Modulus= "+(num1%num2));
                break;
            default:
                System.out.println("Not Valid");
                break;
        }
    }
}

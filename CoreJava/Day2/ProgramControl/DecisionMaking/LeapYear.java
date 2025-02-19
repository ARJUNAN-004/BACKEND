//Write a program to determine if a given year is a leap year.

package DAY02.ProgramControl.DecisionMaking;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 100 != 0 && n % 4 == 0) || (n % 400 == 0)) {
            System.out.println(n + " is Leap Year");
        } else {
            System.out.println(n + " is Not a Leap Year");
        }
    }
}

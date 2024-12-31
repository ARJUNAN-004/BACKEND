//Create a program to exit a loop if the user enters the number 0 (use break).

package DAY02.ProgramControl.JumpStatements;

import java.util.Scanner;

public class ExitLoopWhenZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
        }
    }
}

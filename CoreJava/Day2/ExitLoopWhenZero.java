package DAY02;

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

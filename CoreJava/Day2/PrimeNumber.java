package DAY02;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 1 || n == 0) {
            System.out.println(n + " Not is Prime Number");
        } else {
            for (int i = 2; i <= n; i++) {
                if (n > 1) {
                    if (n % i == 0) {
                        count++;
                    }
                }
            }
            if (count == 1 && n > 2) {
                System.out.println(n + " is Prime Number");
            } else {
                System.out.println(n + " Not is Prime Number");
            }
        }
    }
}

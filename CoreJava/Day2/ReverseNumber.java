<<<<<<< HEAD
package DAY02;

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
=======
package DAY02;

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
>>>>>>> 6dcaddd8bd1fefda478f86ae604161571a2f6db1

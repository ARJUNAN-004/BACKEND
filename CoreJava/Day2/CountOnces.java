<<<<<<< HEAD
package DAY02;

import java.util.Scanner;

public class CountOnces {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        while (n>0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        System.out.println(count);
    }
}
=======
package DAY02;

import java.util.Scanner;

public class CountOnces {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        while (n>0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        System.out.println(count);
    }
}
>>>>>>> 6dcaddd8bd1fefda478f86ae604161571a2f6db1

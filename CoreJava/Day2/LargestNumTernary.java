<<<<<<< HEAD
package DAY02;

import java.util.Scanner;

public class LargestNumTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println("Largest num= "+n);
    }
}
=======
package DAY02;

import java.util.Scanner;

public class LargestNumTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println("Largest num= "+n);
    }
}
>>>>>>> 6dcaddd8bd1fefda478f86ae604161571a2f6db1

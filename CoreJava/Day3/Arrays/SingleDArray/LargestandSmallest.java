//Write a program to find the largest and smallest numbers in an array.

package DAY03.Arrays.SingleDArray;

import java.util.Scanner;

public class LargestandSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[]a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++) {
                if (a[j] < a[i]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Smallest = "+a[0]);
        System.out.println("Largest = "+a[n-1]);
    }
}

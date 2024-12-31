//Create a program to calculate the sum of all elements in an array.

package DAY03.Arrays.SingleDArray;

import java.util.Scanner;
public class SumofOneDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[]a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for (int x:a){
            sum+=x;
        }
        System.out.println("Sum = "+sum);
    }
}

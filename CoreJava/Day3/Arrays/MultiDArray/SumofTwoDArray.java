//Write a program to add two 2D matrices.

package DAY03.Arrays.MultiDArray;

import java.util.Scanner;

public class SumofTwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]a=new int[3][3];
        int[][]b=new int[3][3];
        int[][]sum=new int[3][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b.length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b.length;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b.length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}

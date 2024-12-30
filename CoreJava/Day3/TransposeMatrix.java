package DAY03;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row = ");
        int n= sc.nextInt();
        System.out.println("Enter col = ");
        int m= sc.nextInt();
        int[][]a=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("-- Before Transpose --");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-- After Transpose --");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}

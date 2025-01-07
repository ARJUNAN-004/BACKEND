//Problem Statement 3: Find the Maximum Element in an ArrayList
//Create a program to find the maximum element in an ArrayList of integers.
//Input Example:
//Input list: [15, 22, 8, 42, 17]
//Output Example:
//Maximum Element: 42

package DAY09;
import java.util.*;
public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Collections.addAll(arr,15, 22, 8, 42, 17);
        int max=Integer.MIN_VALUE;
        for (int x:arr){
            if (max<x){
                max=x;
            }
        }
        System.out.println("Max Value = "+max);
    }
}

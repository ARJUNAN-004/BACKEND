//Problem Statement 2: Reverse the ArrayList
//Create a program that reverses the order of elements in an ArrayList.
//Input Example:
//Input list: [1, 2, 3, 4, 5]
//Output Example:
//Reversed List: [5, 4, 3, 2, 1]

package DAY09;
import java.util.ArrayList;
import java.util.Collections;
public class Revarray {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Collections.addAll(arr,1,2,3,4,5);
        System.out.println("--ARRAYLIST--");
        System.out.println(arr);
        System.out.println("--REVERSE ARRAYLIST--");
        Collections.reverse(arr);
        System.out.println(arr);
    }
}

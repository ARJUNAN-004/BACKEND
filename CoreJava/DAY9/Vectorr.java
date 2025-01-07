//You are tasked with creating a program to manage student grades using a Vector in Java. Implement the following functionalities:
//Add grades (as integers) to a vector dynamically.
//Print all grades in the vector.
//Calculate and display:
//The highest grade.
//The lowest grade.
//The average grade.
//Allow the user to remove a specific grade by its index.
//Input Example:
//Add grades: 78, 85, 92, 67, 88.
//Remove grade at index 3.
//Output Example:
//Grades: [78, 85, 92, 88]
//Highest Grade: 92
//Lowest Grade: 78
//Average Grade: 85.75

package DAY09;
import java.util.*;
public class Vectorr {
    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<>();
        Collections.addAll(vec,78,85,92,67,88);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        double avg;
        for (int x:vec){
            if (max<x){
                max=x;
            }
        }
        for (int x:vec){
            if (min>x){
                min=x;
            }
        }
        System.out.println("-- GRADES --");
        System.out.println(vec);
        vec.remove(3);
        for (int x:vec){
            sum+=x;
        }
        avg=sum/(double)vec.size();
        System.out.println("\nHIGHEST VALUE = "+max);
        System.out.println("LOWEST VALUE = "+min);
        //System.out.println("SUM = "+sum);
        System.out.println("AVERAGE VALUE = "+avg);
    }
}

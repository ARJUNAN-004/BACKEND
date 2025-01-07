//Problem Statement 1: Manage a Shopping List
//Create a program that allows the user to manage a shopping list using an ArrayList. Implement the following features:
//Add items to the shopping list.
//Remove an item from the list.
//Display the shopping list.
//Input Example:
//Add items: "Milk", "Eggs", "Bread", "Butter".
//Remove "Eggs".
//Output Example:
//
//Shopping List: [Milk, Bread, Butter]

package DAY09;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>arr=new ArrayList<>();
        while (true){
            System.out.println("-- Choose the Process --");
            System.out.println("1)ADD\n2)REMOVE\n3)SHOW\n4)EXIT");
            int opt= sc.nextInt();
            sc.nextLine();
            switch (opt){
                case 1:
                    System.out.println("Enter element to add =");
                    String addel=sc.nextLine();
                    arr.add(addel);
                    System.out.println(addel+" Added");
                    break;
                case 2:
                    System.out.println("Enter element to remove =");
                    String revel=sc.nextLine();
                    arr.remove(revel);
                    System.out.println(revel+" Removed");
                    break;
                case 3:
                    System.out.println("Total elements = ");
                    System.out.println(arr);
                    break;
                case 4:
                    System.out.println("-- Exiting Process --");
                    break;
                default:
                    System.out.println("Invalid output");
            }
        }
    }
}

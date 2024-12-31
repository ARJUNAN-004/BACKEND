//Create a class Utility with a static method convertToUpper(String str) that takes a string as input and returns it in uppercase. Test this method in the main function.

package DAY03.Static.StaticVariableandMethods;

import java.util.Scanner;

public class Utility {
    public Utility(){
    }
    public static String convertToUpper(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=convertToUpper(sc.nextLine());
        System.out.println(str);
    }
}

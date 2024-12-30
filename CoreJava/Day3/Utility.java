package DAY03;

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

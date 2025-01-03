//Write a generic method printArray(T[] array) to print elements of any array type. Test it with arrays of String, Integer, and Double.


package DAY05.Generic;

import java.util.List;

public class ArrayPrint {
    public static <T> void printArray(T[]arr){
        for (T x:arr){
            System.out.println(x+" ");
        }
    }
    public static void main(String[] args) {
        Object[]strarr={1,"ONE",1.0};
        printArray(strarr);
    }
}

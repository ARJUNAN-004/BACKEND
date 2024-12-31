//Write a program that takes a float as input, converts it to int, and displays both values.
//Try a case where narrowing conversion loses precision (e.g., casting 123.456 to int).

package DAY01;

public class PrimitiveTypeConversion {
    public static void main(String[]args){
        float f=123.456f;
        int a=(int)f;
        System.out.println(f);
        System.out.println(a);
    }
}

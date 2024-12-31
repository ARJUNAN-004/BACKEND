//Implement method overloading in a class Calculator with methods to add integers, doubles, and arrays of numbers.

package DAY02.OopsBasics.Polymorphism;

public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int[] arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        int intt=add(5,6);
        double doub=add(5.40,4.60);
        int arrr=add(new int[]{1,2,3,4,5});

        System.out.println("Sum of int="+intt);
        System.out.println("Sum of double="+doub);
        System.out.println("Sum of array="+arrr);
    }
}

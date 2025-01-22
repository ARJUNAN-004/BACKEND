package DAY17;

import java.util.function.BinaryOperator;

public class BinaryExample {
    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        BinaryOperator<Integer>findmax=(num1,num2)->(num1>num2)?num1:num2;
        System.out.println("The Max num of "+n1+" and "+n2+" is "+findmax.apply(n1,n2));
    }
}

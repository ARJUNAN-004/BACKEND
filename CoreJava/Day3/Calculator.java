package DAY03;

public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println("Addition = "+add(11,22));
        System.out.println("Addition = "+add(10.11,20.22));
        System.out.println("Addition = "+add(11,22,33));
    }
}

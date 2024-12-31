//Write a program that has multiple overloaded methods for calculating the area of a rectangle, circle, and triangle.

package DAY02.This.MethodOverloadinng;

public class Area {
    public double RectArea(double a,double b){
        return a*b;
    }
    public double CircleArea(double r){
        return Math.PI*r*r;
    }
    public double TriArea(double a,double b){
        return 0.5*a*b;
    }
    public static void main(String[] args) {
        Area area=new Area();
        double Rectangle=area.RectArea(3,6);
        double Cicle=area.CircleArea(5);
        double Triangle=area.TriArea(3,6);
        System.out.println(Rectangle);
        System.out.println(Cicle);
        System.out.println(Triangle);
    }
}

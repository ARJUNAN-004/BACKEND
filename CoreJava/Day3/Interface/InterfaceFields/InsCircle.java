//Define an interface Constants with static fields like PI = 3.14. Create a class Circle that uses this constant to calculate the area of a circle.

package DAY03.Interface.InterfaceFields;
interface Constants{
    double PI=3.14;
}
class Circle implements Constants{
    double rad;
    public Circle(double rad){
        this.rad=rad;
    }
    public void calculateArea(){
        System.out.println("The Area of Circle = "+(PI*rad*rad));
    }
}
public class InsCircle {
    public static void main(String[] args) {
        Circle c=new Circle(4);
        c.calculateArea();

    }
}

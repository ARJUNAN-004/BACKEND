//Use Math class methods like sqrt() and pow() in a program to
// calculate the hypotenuse of a right-angled triangle using static imports.


package DAY05.ImpAndPkg;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Hypotenuse {
    double a=10;
    double b=20;
    public void calculateHyp() {
        System.out.println("The Hypotenuse of Triangle = "+(sqrt(pow(a, 2) + pow(b, 2))));
        System.out.println(sqrt(5));
    }
    public static void main(String[] args) {
        Hypotenuse c=new Hypotenuse();
        c.calculateHyp();
    }
}

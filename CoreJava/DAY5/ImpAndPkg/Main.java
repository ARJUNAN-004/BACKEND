//Create a package shapes with two classes:
//Circle with a method to calculate the area of a circle.
//Rectangle with a method to calculate the area of a rectangle.
//Write a Main class in the default package to import and use these classes.

package DAY05.ImpAndPkg;

import DAY05.ImpAndPkg.SHAPE.Circle;
import DAY05.ImpAndPkg.SHAPE.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle cr=new Circle(5);
        Rectangle rect=new Rectangle(5,7);
        cr.calculateArea();
        rect.calculateArea();
    }
}

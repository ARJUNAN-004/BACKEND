//Create a package shapes with two classes:
//Circle with a method to calculate the area of a circle.
//Rectangle with a method to calculate the area of a rectangle.
//Write a Main class in the default package to import and use these classes

package DAY05.ImpAndPkg.SHAPE;
public class Circle {
    double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public void calculateArea() {
        System.out.println("Area of Circle = " + (Math.PI * rad + rad));
    }

}


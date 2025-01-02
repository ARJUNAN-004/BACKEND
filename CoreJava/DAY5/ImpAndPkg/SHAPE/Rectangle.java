//Create a package shapes with two classes:
//Circle with a method to calculate the area of a circle.
//Rectangle with a method to calculate the area of a rectangle.
//Write a Main class in the default package to import and use these classes

package DAY05.ImpAndPkg.SHAPE;

public class Rectangle{
    double len;
    double hgt;

    public Rectangle(double len,double hgt) {
        this.len = len;
        this.hgt=hgt;
    }
    public void calculateArea(){
        System.out.println("Area of Rectangle = "+(len*hgt));
    }
}

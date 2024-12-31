//Create an abstract class Shape with an abstract method calculateArea(). Derive classes Circle and Rectangle and implement the calculateArea() method in both.

package DAY03.AbtractClasses.AbtractClassExp;

abstract class Abshape {
    public abstract double calculateArea();

    static class Circle extends Abshape{
        double rad;
        public Circle(double rad){
            this.rad=rad;
        }
        public double calculateArea(){
            return Math.PI*rad*rad;
        }
    }
    static class Rectangle extends Abshape{
        double height;
        double length;
        public Rectangle(double height,double length) {
            this.height=height;
            this.length=length;
        }
        public  double calculateArea(){
            return height*length;
        }
    }
    public static void main(String[] args) {
        Abshape c=new Circle(4);
        Abshape r=new Rectangle(5,7);
        System.out.println("Area of Circle = "+c.calculateArea());
        System.out.println("Area of Rectangle = "+r.calculateArea());
    }
}

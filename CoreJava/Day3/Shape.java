package DAY03;
public class Shape {
    public void area(){
        System.out.println("Shape Area");
    }
    public static class Rectange extends Shape {
         int length;
         int breadth;

        public Rectange() {
            this.length = 5;
            this.breadth = 8;
        }
        public void area() {
            System.out.println("Aera of the Rectangle = "+(length*breadth));
        }
    }
        static class Square extends Rectange{
         int side;
        public Square(int side){
            this.side=side;
        }
            public void area(){
                System.out.println("Aera of the Square = "+(side*side));
            }
        }

    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.area();
        Shape rect=new Rectange();
        rect.area();
        Shape sqt =new Square(4);
        sqt.area();

    }
}

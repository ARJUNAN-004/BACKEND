package DAY03;

public class Vehicle {
    public void start(){
        System.out.println("Vehicle Started !!");
    }
     static class Car extends Vehicle{
        public void start(){
            System.out.println("Car Started !!");
        }
    }
    public static void main(String[] args) {
Vehicle p1=new Vehicle();
Vehicle c1= new Car();
p1.start();
c1.start();

    }
}

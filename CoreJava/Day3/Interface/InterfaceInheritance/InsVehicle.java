//Define an interface Vehicle with a method start(). Derive two interfaces FourWheeler and TwoWheeler from it, each adding its specific methods. Implement these in relevant classes.

package DAY03.Interface.InterfaceInheritance;
interface InVehicle{
    void start();
}
interface TwoWheeler extends InVehicle{
    void twotier();
}
interface FourWheeler extends InVehicle{
    void fourtier();
}
class Bike implements TwoWheeler{

    public void start() {
        System.out.println("Two Wheeler Started..");
    }
    public void twotier() {
        System.out.println("Two Wheeler Has 2 Tiers");
    }
}
class Car implements FourWheeler{
    @Override
    public void start() {
        System.out.println("Four Wheeler Started..");
    }
    @Override
    public void fourtier() {
        System.out.println("Four Wheeler Has 4 Tiers");
    }

}
public class InsVehicle {
    public static void main(String[] args) {
        InVehicle car=new Car();
        car.start();
        ((FourWheeler)car).fourtier();
        InVehicle bike=new Bike();
        bike.start();
        ((TwoWheeler)bike).twotier();
    }
}

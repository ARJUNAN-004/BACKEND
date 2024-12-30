package DAY03;

abstract class Appliance {
    public abstract void turnOn();
    public void turnOff(){
        System.out.println("Appliance is TurnOff !!");
    }
    static class Fan extends Appliance{
        @Override
        public void turnOn() {
            System.out.println("Fan is TurnOn !!");
        }
    }
    public static void main(String[] args) {
        Appliance a1=new Fan();
        a1.turnOn();
        a1.turnOff();
    }
}

//Create a class Car with attributes like brand, model, and price. Write methods to display details of a car and calculate the discounted price.

package DAY02.OopsBasics.ClassAndObjects;

public class Car {
    private String brand;
    private String model;
    private double price;
    public Car(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void DisplayDetails(){
        System.out.println("Car Brand="+brand);
        System.out.println("Car Model="+model);
        System.out.println("Car Original Price="+price);
    }
    public void Discount(){
        int n=10;
        double dis=price/n;
        System.out.println("Discount Percent="+n);
        System.out.println("Discount="+dis);
        System.out.println("Price After Discount="+(price-dis));
    }
    public static void main(String[] args) {
        Car car1=new Car("Toyota","24Shift",98000);
        car1.DisplayDetails();
        car1.Discount();
    }
}

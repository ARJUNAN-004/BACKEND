package DAY03;
public class Animal {
    public void sound(){
        System.out.println("Animal Sound !!!");
    }
    public static class Dog extends Animal {
        public void sound() {
            super.sound();
            System.out.println("Bark");
        }
    }
    static class Cat extends Animal{
        public void sound(){
            //super.sound();
            System.out.println("Meow");
        }
    }
    public static void main(String[] args) {
        Animal c=new Cat();
        Animal d=new Dog();
        d.sound();
        c.sound();

    }
}

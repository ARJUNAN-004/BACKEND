package DAY03;
interface InAnimal{
    void eat();
    void sleep();
}
class Dog implements InAnimal{

    @Override
    public void eat() {
        System.out.println("The Dog is Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("The Dog is Sleeping...");
    }
}
class Cat implements InAnimal{

    @Override
    public void eat() {
        System.out.println("The Cat is Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("The Cat is Sleeping...");
    }
}
public class InsAnimal {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.sleep();
        Cat c=new Cat();
        c.eat();
        c.sleep();
    }
}

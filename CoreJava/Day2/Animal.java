<<<<<<< HEAD
package DAY02;

class Animal {
    public void speak(){
        System.out.println("Animal Speak");
    }
     class Dog extends Animal{
         public void speak() {
             System.out.println("Dog Speak");
         }
     }
    class Cat extends Animal{
        public void speak() {
            System.out.println("Cat Speak");
        }
    }
    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal dog=animal.new Dog();
        Animal cat=animal.new Cat();
        animal.speak();
        dog.speak();
        cat.speak();
    }
}
=======
package DAY02;

class Animal {
    public void speak(){
        System.out.println("Animal Speak");
    }
     class Dog extends Animal{
         public void speak() {
             System.out.println("Dog Speak");
         }
     }
    class Cat extends Animal{
        public void speak() {
            System.out.println("Cat Speak");
        }
    }
    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal dog=animal.new Dog();
        Animal cat=animal.new Cat();
        animal.speak();
        dog.speak();
        cat.speak();
    }
}
>>>>>>> 6dcaddd8bd1fefda478f86ae604161571a2f6db1

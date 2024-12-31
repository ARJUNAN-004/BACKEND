//Create a class Animal with a method speak(). Derive classes Dog and Cat and override the speak() method to display appropriate sounds.

package DAY02.OopsBasics.Inheritance;

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

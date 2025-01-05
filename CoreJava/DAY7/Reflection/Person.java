//Write a Java program to demonstrate the use of reflection. Your program should:
package DAY07.Reflection;
public class Person {
    private String name;
    private int age;
    public Person(){
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        System.out.println("Age showed");
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println("Invoke Displayed");
    }
    public static void main(String[] args) {

    }
}

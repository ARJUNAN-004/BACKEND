//Create a class Student with attributes like name and age. Initialize these attributes using a parameterized constructor.

package DAY02.Constructors.ParameterizedConstructors;

public class Student {
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void Display(){
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
    public static void main(String[] args) {
        Student stu=new Student("joyboy",24);
        stu.Display();
    }
}

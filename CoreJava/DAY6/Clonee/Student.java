//Create a class Student with fields for the name and age. Write a program to create a clone (copy) of a Student object using the clone() method.


package DAY06.Clonee;

public class Student implements Cloneable{
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Object display(){
        return "Name = "+name+" \nAge = "+age;

    }

    public static void main(String[] args) {

        try {
            Student stu = new Student("JoyBoy", 21);
            Student stu1 = (Student) stu.clone();
            System.out.println(stu1.display());
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Error");
        }
    }
}

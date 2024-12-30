package DAY02;

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

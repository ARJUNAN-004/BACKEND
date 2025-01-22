package DAY17;
interface StudentFactory{
     ConsMethodRef create(String name,int marks);
}
public class ConsMethodRef {
    String name;
    int marks;

    public ConsMethodRef(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public String toString() {
        return "Name = "+name+", Marks = " + marks;
    }

    public static void main(String[] args) {
        StudentFactory stu=ConsMethodRef::new;
        ConsMethodRef s1= stu.create("Joyboy",100);
        ConsMethodRef s2= stu.create("Zoro",80);
        System.out.println(s1);
        System.out.println(s2);
    }
}

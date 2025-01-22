package DAY17;

import java.util.ArrayList;
import java.util.List;

public class StudentRef {
    String name;
    int marks;
    public StudentRef(String name, int marks){
      this.name=name;
      this.marks=marks;
    }
    public void DisplayDetails(){
        System.out.println("Name = "+name+", Mark = "+marks);
    }
    public static void main(String[] args) {
        List<StudentRef> studentRefList=new ArrayList<>();
        studentRefList.add(new StudentRef("Joyboy",100));
        studentRefList.add(new StudentRef("Zoro",90));
        studentRefList.add(new StudentRef("Sanji",80));
        studentRefList.add(new StudentRef("Law",70));
        studentRefList.forEach(StudentRef::DisplayDetails);
    }
}

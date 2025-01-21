package DAY15;

import java.util.ArrayList;
import java.util.List;

public class StudentSort {
    String name;
    double gpa;

    StudentSort(String name,double gpa){
        this.gpa=gpa;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student" + getName()+ "gpa "+getGpa();
    }
    static void SortStudents(List<StudentSort> st){
        st.sort((s1,s2)->Double.compare(s2.getGpa(),s1.getGpa()));
    }
    public static void main(String[] args) {
        List<StudentSort> st = new ArrayList<StudentSort>();
        st.add(new StudentSort("joyboy",7.7));
        st.add(new StudentSort("Vasanth Kumar",8.9));
        st.add(new StudentSort("gnanam",4.3));
        SortStudents(st);
        for(StudentSort i :st){
            System.out.println(i);
        }
    }
}

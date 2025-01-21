package DAY16;

import DAY15.StudentSort;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PassGrades {
    String name;
    int mark;
    public PassGrades(String name,int mark){
        this.mark=mark;
        this.name=name;
    }
    public static List<PassGrades> passGradesList(List<PassGrades> marks, Predicate<PassGrades> predicate){
        return marks.stream().filter(predicate).collect(Collectors.toList());
    }
    public String toString(){
        return name+" -> "+mark;
    }
    public static void main(String[] args) {
        List<PassGrades> st = new ArrayList<PassGrades>();
        st.add(new PassGrades("John",75));
        st.add(new PassGrades("Alice",55));
        st.add(new PassGrades("Mark",88));
        List<PassGrades>newst=passGradesList(st,stu->stu.mark>60);
        System.out.println("<<-- Marks Above 60 -->>");
        newst.forEach(System.out::println);
    }
}

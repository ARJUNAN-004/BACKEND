package DAY15;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TopScore {
    String name,dept;
    double gpa;
    TopScore(String name,String dept,double gpa) {
        this.name = name;
        this.dept = dept;
        this.gpa = gpa;
    }
    public String toString(){
        return dept+"= "+name+"->"+gpa;
    }
    public static void main(String[] args) {
        List<TopScore>score=List.of(
        new TopScore("Luffy","CSE",6.7),
        new TopScore("Zoro","IT",8.5),
        new TopScore("Sanji","IT",8.8),
        new TopScore("Law","CSE",7.7));
        score.stream().collect(Collectors.groupingBy(s->s.dept, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(s->s.gpa)), Optional::get))).values().forEach(System.out::println);
    }
}

package DAY15;

import java.util.*;

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
        Map<String, TopScore> topScores = new HashMap<>();

        for (TopScore s : score) {
            String dept = s.dept;
            if (!topScores.containsKey(dept) || s.gpa > topScores.get(dept).gpa) {
                topScores.put(dept, s);
            }
        }

        for (TopScore topScore : topScores.values()) {
            System.out.println(topScore);
        }
    }
}

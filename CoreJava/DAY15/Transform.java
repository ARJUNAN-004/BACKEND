package DAY15;

import java.util.ArrayList;
import java.util.List;

public class Transform {
    public static List<String> namess(List<String>names){
        List<String> transformedNames = new ArrayList<>();
        for (String name : names) {
            transformedNames.add("Student = " + name.toUpperCase());
        }
        return transformedNames;
    }
    public static void main(String[] args) {
        List<String> names=List.of("Joyboy","Teddy","Green","Negan");
        List<String> newnamess=namess(names);
        newnamess.forEach(System.out::println);
    }
}

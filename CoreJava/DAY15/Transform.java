package DAY15;

import java.util.List;
import java.util.stream.Collectors;

public class Transform {
    public static List<String> namess(List<String>names){
        return names.stream().map(name->"Student = "+name.toUpperCase()).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> names=List.of("Joyboy","Teddy","Green","Negan");
        List<String> newnamess=namess(names);
        newnamess.forEach(System.out::println);
    }
}

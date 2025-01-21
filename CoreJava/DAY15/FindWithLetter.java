package DAY15;

import java.util.List;
import java.util.stream.Collectors;

public class FindWithLetter {
    String name;
    public FindWithLetter(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name;
    }

    public static List<String> letterss(List<String> names, char letter){
        return names.stream().filter(s->s.startsWith(String.valueOf(letter))).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> names=List.of("Luffy","Zoro","Golu","Guru");
    char l='G';
    List<String>namess=letterss(names,l);
    namess.forEach(System.out::println);
    }
}

package DAY15;

import java.util.ArrayList;
import java.util.List;

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
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith(String.valueOf(letter))) {
                filteredNames.add(name);
            }
        }
        return filteredNames;
    }
    public static void main(String[] args) {
        List<String> names=List.of("Luffy","Zoro","Golu","Guru");
    char l='G';
    List<String>namess=letterss(names,l);
    namess.forEach(System.out::println);
    }
}

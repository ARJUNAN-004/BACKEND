package DAY16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StartwithLetter {
    public StartwithLetter(){
        List<String> names=List.of("Apple", "Banana", "Avocado", "Cherry");
        System.out.println(names);
        char ch='A';
        List<String>newNames=firstLetter(names,(name)->name.startsWith(String.valueOf(ch)));
        System.out.println("Output ="+newNames);
    }
    public List<String> firstLetter(List<String> names, Predicate<String> predicate){
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (predicate.test(name)) {
                filteredNames.add(name);
            }
        }
        return filteredNames;    }
    public static void main(String[] args) {
new StartwithLetter();

    }
}

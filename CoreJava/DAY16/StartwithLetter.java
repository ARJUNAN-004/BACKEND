package DAY16;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StartwithLetter {
    public StartwithLetter(){
        List<String> names=List.of("Apple", "Banana", "Avocado", "Cherry");
        System.out.println(names);
        char ch='A';
        List<String>newNames=firstLetter(names,(name)->name.startsWith(String.valueOf(ch)));
        System.out.println("Output ="+newNames);
    }
    public List<String> firstLetter(List<String> names, Predicate<String> predicate){
        return names.stream().filter(predicate).collect(Collectors.toList());
    }
    public static void main(String[] args) {
new StartwithLetter();

    }
}

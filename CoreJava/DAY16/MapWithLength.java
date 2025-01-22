package DAY16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapWithLength {
    public static void main(String[] args) {
        List<String> words=List.of("Hlo","world","Java");
        Function<String,Integer> strlength=String::length;
        List<Integer> len = new ArrayList<>();

        for (String word : words) {
            len.add(strlength.apply(word));
        }        System.out.println(len);
    }
}

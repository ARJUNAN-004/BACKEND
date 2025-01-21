package DAY16;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapWithLength {
    public static void main(String[] args) {
        List<String> words=List.of("Hlo","world","Java");
        Function<String,Integer> strlength=String::length;
        List<Integer>len=words.stream().map(strlength).collect(Collectors.toList());
        System.out.println(len);
    }
}

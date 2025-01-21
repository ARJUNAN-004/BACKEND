package DAY16;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenFilter {
    public EvenFilter(){
        List<Integer> marks=List.of(12,45,22,35,60);
        System.out.println("Input ="+marks);
        List<Integer>newEven=printEven(marks,(mark)->mark%2==0);
        System.out.println("Output ="+newEven);
    }
    public List<Integer> printEven(List<Integer> marks, Predicate<Integer>predicate){
        return marks.stream().filter(predicate).collect(Collectors.toList());
            }
    public static void main(String[] args) {
        new EvenFilter();
    }
}

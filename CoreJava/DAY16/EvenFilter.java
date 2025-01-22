package DAY16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvenFilter {
    public EvenFilter(){
        List<Integer> marks=List.of(12,45,22,35,60);
        System.out.println("Input ="+marks);
        List<Integer>newEven=printEven(marks,(mark)->mark%2==0);
        System.out.println("Output ="+newEven);
    }
    public List<Integer> printEven(List<Integer> marks, Predicate<Integer>predicate){
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer mark : marks) {
            if (predicate.test(mark)) {
                evenNumbers.add(mark);
            }
        }
        return evenNumbers;            }
    public static void main(String[] args) {
        new EvenFilter();
    }
}

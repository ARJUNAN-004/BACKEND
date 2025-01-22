package DAY17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;

public class StaticMethodRef {
    public static void main(String[] args) {
        List<Double>s1=List.of(1.0,2.0,3.0,4.0,5.0);
        List<Double>s2=new ArrayList<>();
        for (Double d:s1) {
            DoubleFunction<Double> Square = Math::sqrt;
            Double sq = Square.apply(d);
            s2.add(sq);
        }
        System.out.println(s2);

    }
}

package DAY16;

import java.util.List;
import java.util.function.BiConsumer;

public class SumOfBiCons {
    public SumOfBiCons(){
        List<Integer>nums=List.of(1,2,3,4,5);
        BiConsumer<Integer,Integer>sum=(n1,n2)-> System.out.println("Sum of "+n1+" and "+n2+" is "+(n1+n2));
        sum.accept(nums.get(1),nums.get(2));
    }
    public static void main(String[] args) {
new SumOfBiCons();
    }
}

package DAY17;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args) {
        Supplier<Integer> rand=()->new Random().nextInt(100);
        for (int i=0;i<5;i++){
            System.out.println(rand.get());
        }
    }
}

package DAY17;

import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryExample {
    public static void main(String[] args) {
        List<String>ss=List.of("joyboy","zoro","sanji");
        UnaryOperator<String>s=(exp)->exp.toUpperCase();
        for (String name:ss){
            System.out.println(s.apply(name));
        }


    }
}

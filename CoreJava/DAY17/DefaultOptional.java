package DAY17;

import java.util.List;
import java.util.Optional;

public class DefaultOptional {
    public static void main(String[] args) {
        String names[]={"Hlo",null,"Java"};
        for (String n:names){
            Optional<String> name=Optional.ofNullable(n);
            System.out.println("String = "+name.orElse("Guest"));
        }

    }
}

package DAY17;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NullOptional {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("Hlo",null,"Java");
        for (String n:names){
            Optional<String>name=Optional.ofNullable(n);
                if (name.isPresent()){
                    System.out.println("String Value = "+name.get());
                }
                else {
                    System.out.println("Empty input");
                }
            }

    }
}

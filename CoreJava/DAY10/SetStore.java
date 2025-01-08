package DAY10;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetStore {
    public static void main(String[] args) {
        Set<String>ss=new HashSet<>();
        Collections.addAll(ss, "Alice", "Bob", "Alice", "Eve", "Charlie");
        System.out.print("Updated Names = ");
        System.out.print(ss);
    }
}

package DAY17;

import java.util.ArrayList;
import java.util.List;

public class InsMethodRef {
    public static void main(String[] args) {
        List<String>ss=new ArrayList<>(List.of("Kavin","Arjun","Varun","Sanjay","Gnanam"));
        ss.sort(String::compareToIgnoreCase);
        System.out.println(ss);
    }
}

package DAY10;

import java.util.HashMap;
import java.util.Map;

public class MapStore {
    public static void main(String[] args) {
        HashMap<String, Integer> ss = new HashMap<>();
        ss.put("Alice", 85);
        ss.put("Bob", 90);
        ss.put("Charlie", 88);
        System.out.println(ss);
        ss.put("Bob", 92);
        System.out.println(ss);
        System.out.println("Alice's Grade = "+ss.get("Alice"));
        for (Map.Entry<String,Integer> s:ss.entrySet()){
            System.out.println(s.getKey()+" = "+s.getValue());
        }
    }
}
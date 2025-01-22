package DAY17;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CurrentTime {
    public static void main(String[] args) {
        Supplier<LocalDateTime>curTime=()-> LocalDateTime.now();
        System.out.println(curTime.get());
    }

    public static class InsMethodRef {
        public static void main(String[] args) {
            List<String> ss= new ArrayList<>(List.of("Bavi", "Arjun", "Kavin", "Guru", "Arun", "Gnana"));
            ss.sort(String::compareToIgnoreCase);
            System.out.println(ss);

        }
    }
}

package DAY10;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class CustomerSupportSystem {
    public static void main(String[] args) {
        Queue<String>ss=new LinkedList<>();
        Collections.addAll(ss,"Alice", "Bob", "Charlie");
        System.out.println("Serving ="+ss.poll());
        System.out.println("Waiting = "+ss);
    }
}

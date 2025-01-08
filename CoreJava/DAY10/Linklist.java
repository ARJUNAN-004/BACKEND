package DAY10;

import java.util.*;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<String>ss=new LinkedList<>();
        Collections.addAll(ss,"Finish homework", "Go for a run", "Prepare dinner");
        ss.remove("Go for a run");
        for (String s:ss){
            System.out.println((ss.indexOf(s)+1)+". "+s);
        }
    }
}

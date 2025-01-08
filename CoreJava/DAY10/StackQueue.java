package DAY10;

import java.util.*;

public class StackQueue {
    public static void main(String[] args) {
        Stack<String> ss = new Stack<>();
        ss.push("Hello");
        ss.push("World");
        ss.pop();
        ss.push("Java");
        System.out.print("Current Text = ");
        for (String s:ss){
            System.out.print(s+" ");
        }
    }
}

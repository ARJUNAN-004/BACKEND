//Use a Main class to demonstrate autoboxing, access modifiers, and package imports.

package DAY05.Main;

import DAY05.Utilities.Container;
import DAY05.Utilities.Priority;

public class Main {
    public static void main(String[] args) {
        Container<Integer>n=new Container<>(10);
        System.out.println("Value = "+n.getVal());
        Container<Priority>p=new Container<>(Priority.HIGH);
        System.out.println("Priority = "+p.getVal());
    }
}

package DAY16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ModifyMarks {
    String name;
    int mark;
    public ModifyMarks(String name, int mark){
        this.mark=mark;
        this.name=name;
    }
    public void applygrade(Consumer<ModifyMarks> marksConsumer){
        marksConsumer.accept(this);
    }
    public String toString(){
        return name+" -> "+mark;
    }
    public static void main(String[] args) {
        List<ModifyMarks> st = new ArrayList<>();
        st.add(new ModifyMarks("John",70));
        st.add(new ModifyMarks("Alice",60));
        st.add(new ModifyMarks("Mark",50));
        Consumer<ModifyMarks>inc=s->s.mark+=10;
        st.forEach(s->s.applygrade(inc));
        st.forEach(System.out::println);

    }
}

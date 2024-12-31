//Create two interfaces Printer with a method print() and Scanner with a method scan(). Create a class AllInOne that implements both interfaces.

package DAY03.Interface.MultipleInterface;
interface Printer{
    default void print(){
        System.out.println("Printing is Done");
    }
}
interface Scaner{
     default void scan(){
        System.out.println("Scanning is Done");
    }
}
class AllinOne implements Printer,Scaner{
    public void print(){
        System.out.println("All Printing is Done");
    }
    public void scan(){
        System.out.println("All Scanning is Done");
    }
}
public class MultiInter {
    public static void main(String[] args) {
        AllinOne a=new AllinOne();
        a.print();
        a.scan();
    }
}

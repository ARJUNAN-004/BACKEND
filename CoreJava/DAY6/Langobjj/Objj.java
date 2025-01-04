//Create a program that demonstrates:
//Creating an object of a class.
//Using the basic methods of the Object class: getClass() and toString().

package DAY06.LangCls;

public class Objj {
    private String name;
    public Objj(String name){
        this.name=name;
    }
    public String toString(){
        return  "The ToString ="+name;
    }
    public static void main(String[] args) {
        Objj ob=new Objj("JoyBoy");
        System.out.println("GetClass = "+ob.getClass());
        System.out.println(ob);
    }
}

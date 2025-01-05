//Dynamically load a custom class (e.g., Person) using its fully qualified name.
//Display the following details about the class:
//All declared methods and their return types.
//All declared fields and their types.
//All constructors.
//Dynamically invoke a method on an object of the class, provided the method name and arguments as input.


package DAY07.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect {
    public static void main(String[] args) {
        try {
            Class cls=Class.forName("DAY07.Reflection.Person");
            Constructor cons[]=cls.getDeclaredConstructors();
            System.out.println("Cons = ");
            for (Constructor c:cons){
                System.out.println(c+" ");
            }
            System.out.println("Fields = ");
            Field field[]=cls.getDeclaredFields();
            for (Field f:field){
                System.out.println(f+" ");
            }
            System.out.println("Methods = ");
            Method method[]=cls.getDeclaredMethods();
            for (Method m:method){
                System.out.println(m+" ");
            }
            System.out.println("Parameter Passing = ");
            Person per=(Person) cons[1].newInstance("Nikaman",20);
            System.out.println(per);

            System.out.println("Invoke = ");
            for (int i=0;i<method.length;i++){
                if (method[i].getName().indexOf("display")!=-1){
                    method[i].setAccessible(true);
                    method[i].invoke(cls);
                }
            }
        }
        catch (Exception e){
        }
    }
}

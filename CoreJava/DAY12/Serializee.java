package DAY12;

import java.io.*;

class Person implements Serializable{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Serializee {
    public static void main(String[] args) throws FileNotFoundException {
        Person p=new Person("JoyBoy",23);
        try (ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("NewFile.ser"))){
            ob.writeObject(p);
            System.out.println("Object Serialized to File");
        } catch (IOException e) {
            System.out.println("Error"+e.getMessage());
        }
        try (ObjectInputStream ob=new ObjectInputStream(new FileInputStream("NewFile.ser"))){
            Person des=(Person)ob.readObject();
            System.out.println("Object Serialized to File");
            System.out.println(des);
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
}

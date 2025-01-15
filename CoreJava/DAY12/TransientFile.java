package DAY12;

import java.io.*;

class Person1 implements Externalizable{
    String name;
    transient int age;
    public Person1(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Write External...");
        out.write(age);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Read External...");
        age=in.read();
        name=in.readUTF();
    }
}
public class TransientFile {
    public static void main(String[] args) throws FileNotFoundException {
        Person1 p=new Person1("JoyBoy",21);
        try (ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("NewFile1.ser1"))){
            ob.writeObject(p);
            System.out.println("Object Serialized to File");
        } catch (IOException e) {
            System.out.println("Error"+e.getMessage());
        }
        try (ObjectInputStream ob=new ObjectInputStream(new FileInputStream("NewFile.ser"))){
            Person1 des1=(Person1)ob.readObject();
            System.out.println("Object Serialized to File");
            System.out.println(des1);
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
}

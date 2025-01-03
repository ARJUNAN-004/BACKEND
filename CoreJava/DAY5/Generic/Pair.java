//Create a generic class Pair<K, V> to hold a key-value pair. Write a program to store and display pairs of different data types, like <String, Integer> or <Integer, String>.


package DAY05.Generic;

public class Pair <K,V>{
    private K key;
    private V value;
    public Pair(K key,V value){
        this.key=key;
        this.value=value;
    }
    public void Display(){
        System.out.println("Key = "+key+"\nValue = "+value);
    }

    public static void main(String[] args) {
        Pair<String,Integer>n1=new Pair<String,Integer>("One",1);
        Pair<Integer,String>n2=new Pair<Integer,String>(2,"Two");
        n1.Display();
        n2.Display();
    }
}

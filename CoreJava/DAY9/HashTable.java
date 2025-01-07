//Create a program to manage a contact directory using a Hashtable in Java. Implement the following functionalities:
//Add contacts with the name as the key and phone number as the value.
//Search for a contact by name and display their phone number.
//Remove a contact by name.
//Display all contacts in the directory.
//Input Example:
//Add contacts: John -> 9876543210, Alice -> 9123456780, Bob -> 8899776655.
//Search for Alice.
//Remove contact Bob.
//Output Example:
//Contact Directory:
//John: 9876543210
//Alice: 9123456780
//Search Result for Alice: 9123456780
//After Removal:
//John: 9876543210
//Alice: 9123456780

package DAY09;

import java.util.*;
public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, Long> arr = new Hashtable<>();

        arr.put("John", 9876543210L);
        arr.put("Alice", 9123456780L);
        arr.put("Bob", 8899776655L);

        System.out.println("-- Initial Contacts --");
        for (String key : arr.keySet()) {
            System.out.println(key + ": " + arr.get(key));
        }
        String sname = "Alice";
        System.out.println("\nSearch for "+sname+" = "+arr.get(sname));

        String removeName="Bob";
        arr.remove(removeName);
        System.out.println("\nAfter Removal:");
        arr.forEach((key,value)->{
            System.out.println(key+ ": "+value);
        });


    }
}

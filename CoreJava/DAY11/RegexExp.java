//Problem Statement
//Task: Write a Java program to validate a list of email addresses using regular expressions. The program should:
//Accept a list of email addresses as input.
//Validate each email address against the following rules:
//It must start with a letter or a number.
//It can include letters, numbers, dots (.), hyphens (-), and underscores (_).
//The domain name should be valid, ending with .com, .org, or .net.
//Print whether each email address is valid or invalid.
//
//Example Input
//Input: ["user@example.com", "user.name@domain.org", "invalid-email@domain", "user@domain_net", "@missinguser.com"]
//Expected Output
//user@example.com: Valid
//user.name@domain.org: Valid
//invalid-email@domain: Invalid
//user@domain_net: Invalid
//@missinguser.com: Invalid

package DAY11;
import java.util.*;
import java.util.regex.Pattern;

public class RegexExp {
    public static boolean ismail(String email) {
        String emailRegex = "^[a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
        return Pattern.matches(emailRegex, email);
    }
    public static void main(String[] args) {
        List<String>mail=new ArrayList<>();
        Collections.addAll(mail,"user@example.com", "user.name@domain.org", "invalid-email@domain", "user@domain_net", "@missinguser.com");
        for (String s : mail) {
            System.out.println(s + " = " + (ismail(s) ? "Valid" : "Invalid"));
        }

    }
}

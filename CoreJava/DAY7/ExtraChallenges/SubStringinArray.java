//Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
//A substring is a contiguous sequence of characters within a string.
//
//Example 1:
//Input: patterns = ["a","abc","bc","d"], word = "abc"
//Output: 3
package DAY07.ExtraChallenges;
import java.util.Scanner;
public class SubStringinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]ss=sc.nextLine().split(",");
        String s=sc.nextLine();
        int n=0;
        for (int i=0;i<ss.length-1;i++){
            if (s.contains(ss[i])){
                n++;
            }
        }
        System.out.println("Number of Substrings in Array = "+n);
    }
}

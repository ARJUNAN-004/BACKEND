//For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
//Given strings sequence and word, return the maximum k-repeating value of word in sequence.
//
//Example 1:
//Input: sequence = "ababc", word = "ab"
//Output: 2
//Explanation: "abab" is a substring in "ababc".
//
//Example 2:
//Input: sequence = "ababc", word = "ba"
//Output: 1
//Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".

package DAY07.ExtraChallenges;
import java.util.Scanner;
public class SubStrRepeatValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sequence=sc.nextLine();
        String word=sc.nextLine();
        int count=0;
                int l=0,r=word.length();
                for (int i=0;i<sequence.length()-1;i++){
                    if (word.equals(sequence.substring(l, r))){
                        count++;
                    }
                    l++;
                    r++;
                }
        System.out.println("Count of Maximum K Substring = "+count);
    }
}

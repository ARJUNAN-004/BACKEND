//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//
//Example 1:
//Input: s = "aba"
//Output: true
//
//Example 2:
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.

package DAY07.ExtraChallenges;

public class Palindrome{
    public static void main(String[] args){
        String s="abca";
        int l=0,r=s.length()-1;
        boolean pal=true;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                pal=ispal(s,l+1,r)||ispal(s,l,r-1);
                break;
            }
            l++;
            r--;
        }
        System.out.println("Output: "+pal);
    }
    private static boolean ispal(String s,int l,int r){
        while(l<r) {
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

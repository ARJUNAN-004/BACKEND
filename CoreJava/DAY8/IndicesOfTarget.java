//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]

package DAY08;
public class IndicesOfTarget {
    public static void main(String[] args) {
        int[]a={2,7,11,15};
        int target=9;
       for (int i=0;i<a.length;i++){
           for (int j=i+1;j<a.length;j++){
               if (a[i]+a[j]==target){
                   System.out.println("The indices are = ["+i+","+j+"]");
               }
           }
       }
    }
}

//Given an array containing n distinct numbers in the range [0, n], find the one number that is missing from the array.
//Example:
//Input: nums = [3, 0, 1]
//Output: 2
//Explanation: The missing number is 2 because it is not in the array.

package DAY08;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[]nums = {3, 0, 1};
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) {
            if (nums[i]!=i){
                System.out.println(i);
            }
        }
    }
}

//Write a function to rotate an array of n integers to the right by k steps.
//
//
//Example:
//Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3
//Output: [5, 6, 7, 1, 2, 3, 4]
//Explanation: Rotate the array to the right by 3 steps.

package DAY08;

public class RotateArray {
    public static void main(String[] args) {
        int[]nums = {1, 2, 3, 4, 5, 6, 7};
        int num1[]=new int[nums.length];
        int k = 3;
        for(int i=0;i<k;i++){
            num1[i]=nums[nums.length - k + i];
        }
        for(int i=k;i<nums.length;i++){
            num1[i]=nums[i-k];
        }
        for (int x:num1){
            System.out.print(x+" ");
        }

    }
}

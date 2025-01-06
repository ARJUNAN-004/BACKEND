//For each element in an array, find the next greater element to its right. If no such element exists, return -1 for that number.
//Example:
//Input: nums = [4, 5, 2, 10]
//Output: [5, 10, 10, -1]
//Explanation: The next greater element for 4 is 5, for 5 is 10, for 2 is 10, and for 10 there is no greater element.

package DAY08;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[]nums = {4, 5, 2, 10};
        int[]num1=new int[nums.length];

        for (int i=0;i<nums.length;i++) {
            int max = -1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    max = nums[j];
                    break;
                }
            }
            num1[i]=max;
        }
            for (int x:num1){
                System.out.print(x+" ");
            }
        }
    }

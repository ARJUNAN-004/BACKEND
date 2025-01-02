//Write a program to add a list of integers using a List<Integer> and demonstrate how autoboxing allows seamless addition of primitive int.

package DAY05.AutoboxAndVar.AutoBox;

import java.util.ArrayList;
import java.util.List;

public class Auto {
    public static int addSum(List<Integer> nums){
        int sum=0;
        for (int x:nums){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        int i=0;
        while(i<10){
            nums.add(i);
            i++;
        }
        System.out.println("Sum = "+addSum(nums));
    }
}

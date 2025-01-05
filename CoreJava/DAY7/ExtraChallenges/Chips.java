//We have n chips, where the position of the ith chip is position[i].
//We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:
//position[i] + 2 or position[i] - 2 with cost = 0.
//position[i] + 1 or position[i] - 1 with cost = 1.
//Return the minimum cost needed to move all the chips to the same position.
//Input: position = [1,2,3]
//Output: 1

package DAY07.ExtraChallenges;

import java.util.Scanner;

public class Chips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={1,2,3};
        int n=arr.length;
        for (int x:arr){
            if (x%2!=0){
                n--;
            }
        }
        System.out.println("Total Moves = "+n);
    }
}

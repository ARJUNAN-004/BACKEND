//Create a method sum(int... numbers) that takes a variable number of integers as input and returns their sum. Test it with different numbers of arguments.

package DAY05.AutoboxAndVar.Varargs;

public class Varargss {
    public static int addNums(int...numbers){
        int sum=0;
        for (int x:numbers){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum 1 ="+addNums(1,2,3,4));
        System.out.println("Sum 2 ="+addNums(1,2,3,4,5));
    }
}

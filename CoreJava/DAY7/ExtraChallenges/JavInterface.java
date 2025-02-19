//A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. In this problem, you will practice your knowledge on interfaces.
//You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
//divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
//Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.
//Sample Input
//6
//Sample Output
//I implemented: AdvancedArithmetic
//12
package DAY07.ExtraChallenges;
import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
public class JavInterface {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyCalculator cal=new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(cal.divisor_sum(sc.nextInt()));
    }
}

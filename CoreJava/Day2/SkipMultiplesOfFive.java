package DAY02;

public class SkipMultiplesOfFive {
    public static void main(String[] args) {
        int n=100;
        for (int i=1;i<=100;i++){
            if(i%5==0){
                continue;
            }
            else {
                System.out.print(i+" ");
            }
        }
    }
}

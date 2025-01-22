package DAY15;

import java.util.ArrayList;
import java.util.List;

public class AverageGpa {
     double gpa;

    AverageGpa(double gpa){
        this.gpa =gpa;
    }

    public double getGpa() {
        return gpa;
    }


    public static double Average(List<AverageGpa> gp){
        double sum = 0.0;
     for(AverageGpa g :gp) {
         sum=sum+g.getGpa();
     }
     return sum/ gp.size();
    }

    public static void main(String[] args) {
        List<AverageGpa> gp = new ArrayList<AverageGpa>();
        gp.add(new AverageGpa(7.6));
        gp.add(new AverageGpa(8.9));
        gp.add(new AverageGpa(2.8));
        System.out.println(Average(gp));
    }
}

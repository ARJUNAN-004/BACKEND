//Create an enum Season with values WINTER, SPRING, SUMMER, and FALL. Add a method getAverageTemperature() to return an average temperature for each season.

package DAY05.EnumInJava.EnumMethods;

public class Enumss {
    public enum Season{
        WINTER,
        SPRING,
        SUMMER,
        FALL;
        }
        public static void getAverageTemperature(Season season){
        switch (season){
            case FALL:
                System.out.println("Fall is 50");
                break;
            case SPRING:
                System.out.println("Spring is 60");
                break;
            case SUMMER:
                System.out.println("Summer is 80");
                break;
            case WINTER:
                System.out.println("Winter is 10");
                break;
            default:
                System.out.println("None");
        }
        }

    public static void main(String[] args) {
        getAverageTemperature(Season.WINTER);
        getAverageTemperature(Season.SUMMER);
        getAverageTemperature(Season.SPRING);
        getAverageTemperature(Season.FALL);
    }
}

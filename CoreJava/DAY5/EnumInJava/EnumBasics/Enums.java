//Define an enum Day with values for all days of the week.
//Write a program to print a message like "It's a weekday" or "It's a weekend" based on the day.

package DAY05.EnumInJava.EnumBasics;

public class Enums {
    public enum Day{
        SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
        SATURDAY(7);
        private final int value;
        Day(int value){
            this.value=value;
        }
        public static void Display(Day day){
            switch (day){
                case SUNDAY :
                case SATURDAY:
                    System.out.println(day+" is Weekend");
                    break;
                default:
                    System.out.println(day+" is WeekDay");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Day.Display(Day.SUNDAY);
        Day.Display(Day.FRIDAY);
        for (Day day:Day.values()){
            System.out.print(day+" ");
        }
        Day days=Day.SATURDAY;
        System.out.println("\n"+days.ordinal());
    }
}

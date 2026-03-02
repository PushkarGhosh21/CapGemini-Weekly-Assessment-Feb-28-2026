package enums;



enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumTest {
    // Enum member variable
    Day day;

    // constructor which takes enum value
    public EnumTest(Day day) { this.day = day; }

    // method to execute action as per enum value
    public void tellItLikeItIs()
    {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are tough");
            break;
        case TUESDAY:
            System.out.println("Tuesday are better");
            break;
        case WEDNESDAY:
            System.out.println("Wednesday are okay");
            break;
        case THURSDAY:
            System.out.println("Thursdays are hopeful");
            break;
        case FRIDAY:
            System.out.println("Fridays are exciting");
            break;
        case SATURDAY:
            System.out.println("Saturdays are relaxing");
            break;
        case SUNDAY:
            System.out.println("Sunday are for rest");
            break;
        default:
            System.out.println("Everyday are good");
            break;
        }
    }

    public static void main(String[] args)
    {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();

        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();

        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();

        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();

        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
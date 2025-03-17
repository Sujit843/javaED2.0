package Enum;

public class Main {
    public static void main(String[] args) {

        System.out.println(Day.FRIDAY);
        System.out.println(Day.MONDAY);
        System.out.println(Day.SATURDAY);

        Day monday = Day.MONDAY;
        int ordinal = monday.ordinal();
        System.out.println(ordinal);
    // ordinal ka matlb index ka pata karna

        System.out.println(monday.name());
        Day enumday = Day.valueOf("MONDAY");
        System.out.println(enumday);

        Day[] values = Day.values();
        for( Day i : values){
            System.out.println(i);

    }

    }
}

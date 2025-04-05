package Collection_Framework.Map.EnumMap;

import Collection_Framework.Map.HashMap.Map;
import CoreJava7.Enum.Day;

import java.util.EnumMap;

public class EnumMapDemo  {
    public static void main(String[] args) {


        EnumMap<Day, String > map = new EnumMap(Day2.class);
        map.put(Day.TUESDAY,"gym");
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(map);
    }
}
 enum Day2{
    MONDAY ,TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY
}
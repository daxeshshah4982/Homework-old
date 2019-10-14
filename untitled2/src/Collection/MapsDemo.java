package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    // store in pair ,keys and values : Entry
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "BMW");
        map.put(6, "Audi");
        map.put(3, "Honda");

        String value1 = map.get(1);
        System.out.println(value1);

        //keys are unique,value can be duplicated

        map.put(2,"BMW");
        map.put(4,"Merc");

        String value2 = map.get(4);
        System.out.println(value2);
    }
}


import java.lang.*;

public class IntegerDemo {

    public static void main(String[] args) {
        demo();
    }
    public static void demo(){
        Integer v = new Integer(10);

      /* returns the integer value of the system property and won't
         print default specified value as specified system property exits */
        String str = "sun.arch.data.model";
        System.out.println(Integer.getInteger(str, v));

      /* returns default specified value as system property "abcd"
         does not exist */
        System.out.println(Integer.getInteger("abd", v));
    }
}

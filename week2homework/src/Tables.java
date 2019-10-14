/* Java programme that takes no. as an input and prints its multiplication table up to 10.
 */

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        int a = 8;
        //  int b;
        //  Scanner sc = new Scanner(System.in);
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " * " + b  + " = " + a * b);
        }

    }
}

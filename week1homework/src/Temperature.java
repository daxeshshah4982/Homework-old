/* convert temperature from fahrenheit to celsius
 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double ftemp;
        double ctemp;
        System.out.println("Enter temperature in Fahrenheit = ");
        ftemp = s1.nextDouble();

        ctemp = (ftemp - 32) / 1.8;

        System.out.println("Degree celsius = " + ctemp);
    }
}



import java.util.Scanner;

/*Input any alphabet from a to f and print their city name accordingly (use switch) any other
Alphabet should be invalid entry
 */
public class SwitchCity {
    public static void main(String[] args) {
        sCity();
    }
    public static void sCity(){
        String a = "Aberdeen", b = "Bangor", c = "Coventry", d = "Derby", e ="Edinburgh", f = "Fakenham";
        System.out.print("Enter any alphabet : ");
        Scanner scr = new Scanner(System.in);
        String alphabet = scr.next();

        switch (alphabet){
            case "a" :
                System.out.println(a);
                break;
            case "b":
                System.out.println(b);
                break;
            case "c":
                System.out.println(c);
                break;
            case "d":
                System.out.println(d);
                break;
            case "e":
                System.out.println(e);
                break;
            case "f":
                System.out.println(f);
                break;
            default:
                System.out.println("Invalid entry");

        }


    }
}

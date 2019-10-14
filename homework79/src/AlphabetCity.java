import java.util.Scanner;

/*Input any alphabet from a to f and print their city name accordingly (use if else) any other
Alphabet should be invalid entry
 */
public class AlphabetCity {
    public static void main(String[] args) {
        city();
    }

    public static void city() {
        String a = "Aberdeen", b = "Bangor", c = "Coventry", d = "Derby", e = "Edinburgh" , f = "Fakenham";

        Scanner scr = new Scanner(System.in);
        System.out.print("enter any alphabet : ");
        String  alphabet = scr.next();

        if (alphabet.equals("a")) {
            System.out.println(a);
        } else if (alphabet.equals("b")){
            System.out.println(b);
        } else if (alphabet.equals("c")){
            System.out.println(c);
        }else if(alphabet.equals("d")){
            System.out.println(d);
        }else if (alphabet.equals("e")){
            System.out.println(e);
        }else if(alphabet.equals("f")){
            System.out.println(f);
        }else {
            System.out.println("Invalid entry");
        }
    }
}

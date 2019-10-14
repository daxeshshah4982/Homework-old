import java.util.Scanner;

/*Write a program that tell us input value is number or an alphabet or symbol.
 */
public class InputValue {
    public static void main(String[] args) {
        num();

    }

    public static void num() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any value : ");
        char value = scr.next().charAt(0);

        if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {
            System.out.println("is an alphabet");
        } else if (value >= '0' && value <= '9') {
            System.out.println("is a number");
        } else {
            System.out.println("is a symbol");
        }


    }


}
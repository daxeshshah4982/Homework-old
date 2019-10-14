import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        dec();
    }

    public static void dec() {
        int i;
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter any integer no. which you want to convert in binary no. = ");
        i = scr.nextInt();

        // Inbuilt function
        String str = Integer.toBinaryString(i);
        System.out.println("Binary value of " + i + " is " + str);

        // Without using inbuilt function

    }

}
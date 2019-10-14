import java.util.Scanner;

public class BinaryAddition {

    public static void main(String[] args) {
        binadd();
    }

    public static void binadd() {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a binary value of x = ");
        String x = scr.nextLine();


        System.out.print("Enter a binary value of y = ");
        String y = scr.nextLine();

        int n1 = Integer.parseInt(x, 2); // here transferring String to Integer by using .parseInt
        int n2 = Integer.parseInt(y, 2); // whereas in bracket x and y are showing string and 2 is base of binary
        // int n1 = Integer.getInteger(x,2);   // same we can use .getInteger String name and Integer value 2 for binary
        // int n2 = Integer.getInteger(y,2);

        int n3 = n1 + n2;

        String str = Integer.toBinaryString(n3);
        System.out.println("Total value of two binary no.s is x + y = " + str);


    }
}


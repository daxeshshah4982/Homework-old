import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        avg();
    }

    private static void avg() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first no. : ");
        int a = scr.nextInt();
        System.out.println("Enter second no. : ");
        int b = scr.nextInt();
        System.out.println("Enter third no. : ");
        int c = scr.nextInt();
        System.out.println("Enter fourth no. :  ");
        int d = scr.nextInt();
        System.out.println("Enter fifth no. : ");
        int e = scr.nextInt();

        int average = (a + b + c + d + e) / 5;
        System.out.println("Average of " + a + " + " + b + " + " + c + " + " + d + " + " + e + " is = " +average);

    }
}

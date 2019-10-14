import java.util.Scanner;

/*
         Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
        Sample Output: Input number: 5
        5 + 55 + 555
*/
public class Series {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int n;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a value for which you want to commute the series no. n = ");
        n = scr.nextInt();

        String n1 = Integer.toString(n, 10); // to make a no., converted int n into string n1
        String n2 = n1 + n1;                       // String addition connect the no means a +a = aa
        String n3 = n1 + n1 + n1;                    // same here a +a +a = aaa

        int n22 = Integer.valueOf(n2);              // again converted string into integer to find value
        int n33 = Integer.valueOf(n3);

        int total = n + n22 + n33;

        System.out.print("the value of " + n +"+" + n2 +"+" + n3 + "=" + total);


    }
}
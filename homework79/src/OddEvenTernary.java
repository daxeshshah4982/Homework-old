/*Write a java program that tell us that Input number is odd or even?
HINT : use turnery operator (? :)
 */

import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        oet();
        oet1();
    }
    // using if and else
    public static void oet(){
        System.out.print("Enter any no. = ");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        if (n%2 == 0){
            System.out.println(n + " is an even no.");
        }else {
            System.out.println(n + " is an odd no.");
        }

    }
    // using ternary
        public static void oet1(){

        System.out.println("Enter any no. = ");
        Scanner scr = new Scanner(System.in);
        int m = scr.nextInt();
        String n = m%2 == 0 ? " is an Even no." : " is an Odd no.";
        System.out.print(m + n);

    }

}

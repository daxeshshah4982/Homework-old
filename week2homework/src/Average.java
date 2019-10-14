/* Write a programme takes 3 numbers as input and calculate its average

 */

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a first no. a =    ");
        a = sc.nextInt();
        System.out.println("Enter a second no. b =    ");
        b = sc.nextInt();
        System.out.println("Enter a third no. c =      ");
        c = sc.nextInt();
        int average = (a * b * c)/3;
        System.out.println("( " + a +" * "+ b + " * " + c + ")"+ "/" + " 3 " + " = " + average);
        //System.out.println(+average);
    }
}

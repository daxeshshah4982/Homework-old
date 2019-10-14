import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args){
        BinaryMultiplication bm1 = new BinaryMultiplication();
        bm1.multi();

    }
    public void multi(){
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter first binary no. a = ");
        String a = scr.nextLine();                     // bcs its String using .nextLine, if it is Integer use .nextInt

        System.out.print("Enter second binary no. b = ");
        String b = scr.nextLine();

        int n1 = Integer.parseInt(a, 2);      // String no.s a and b converting them in integer
        // System.out.println(n1);                   // and here are two methods can use .parse and .getInteger
        int n2 = Integer.parseInt(b,2);     // here radix 2 is showing base 2
        // System.out.println(n2);
        int c = n1 * n2;                            // adding two integer no. which is converted from binary

        String str = Integer.toBinaryString(c);          // inbuilt method to transfer integer to binary

        System.out.println("multiplication of two binary no.s a * b = " +str);




    }
}
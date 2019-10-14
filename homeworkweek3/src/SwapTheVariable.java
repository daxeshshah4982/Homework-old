import java.util.Scanner;

public class SwapTheVariable {
    public static void main(String[] args) {

        SwapTheVariable s1 = new SwapTheVariable();
        s1.swap1();
    }

    public void swap1() {
        int x;
        int y;
        //int temp1;
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a value of x = ");
        x = scr.nextInt();

        System.out.print("Enter a value of y = ");
        y = scr.nextInt();
        // temp1 = y;                                    // here we can make some temp variable and store value in it
        System.out.println("new value of x = " +y);     // but i tried it directly
        // y = x;
        System.out.println("new value od y = " +x);
    }

}

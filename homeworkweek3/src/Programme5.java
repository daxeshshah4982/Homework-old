import java.util.Scanner;

/* Sum of the digits of an integer 25
  need to define sum of two digits 2 and 5 = 7
 */
public class Programme5 {

    public static void main(String[] args) {
        Programme5 p = new Programme5();
        p.add();                                 // calling add method in main method
    }
    public void add() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no. you wants to add digits = ");
        int num = sc.nextInt();                             //calling any no.
        int sum= 0;               // initializing sum with 0 as ahead we are using
        // it in loop and value of sum will change every time

        while (num > 0) {            // using while loop to find remainder by using %
            int rem = num % 10;     // 25/10= quotient 2 and rem 5, so until quotient become 0 we have to run the loop
            sum = sum + rem;         // and sum = 0+5=5 and than in another go quotient become 0 and remainder will be
            num = num / 10;           // 2 so sum would be sum = 5 + 2 = 7
            // here num will change every time when will devide by 10 and quotient become new no.
        }
        System.out.println("sum of all digits = "+sum);
    }
}
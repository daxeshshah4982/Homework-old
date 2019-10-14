import java.util.Scanner;

/*WAP to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class LeapYear {
    public static void main(String[] args) {
        lpyer();
    }

    public static void lpyer() {
        System.out.print("Enter any year : ");
        Scanner scr = new Scanner(System.in);
        int year = scr.nextInt();
        if (year%4 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }



    }
}

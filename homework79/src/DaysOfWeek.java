import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/*Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class DaysOfWeek {
    public static void main(String[] args) {
        week1();
        week2();
    }
    public static void week1(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a nu. from 1 to 7 for days : ");
        int number  = scr.nextInt();
        switch (number){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

        }
    }
    public static void week2(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter any day of the week : ");
        String day = scr.next();
        switch (day.toLowerCase()){
            case "monday" :
                System.out.println("First day of the week");
                break;
            case "tuesday":
                System.out.println("Second day of the week");
                break;
            case "wednesday" :
                System.out.println("Third day of the week");
                break;
            case "thursday" :
                System.out.println("Fourth day of the week");
                break;
            case "friday" :
                System.out.println("Fifth day of the week");
                break;
            case "saturday" :
                System.out.println("Sixth day of the week");
                break;
            case "sunday" :
                System.out.println("Seventh day of the week");
                break;
            default:
                System.out.println("There is no more days in week");
        }
    }

}

import java.util.Scanner;

public class DayOfTheWeekWithSwitch {
    public static void main(String[] args) {
        day();
    }
    public static void day(){
        System.out.print("please enter value of day :  ");
        Scanner scr = new Scanner(System.in);
        int day = scr.nextInt();
        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wedanesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week has only 7 days");
        }



    }
}

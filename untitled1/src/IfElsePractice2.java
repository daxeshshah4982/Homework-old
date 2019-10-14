import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class IfElsePractice2 {
    public static void main(String[] args) {
        day();
    }
    public static void day(){
        System.out.print("Please enter no of day :  ");
        Scanner scr = new Scanner(System.in);
        int day = scr.nextInt();
        if (day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");
        }else if ( day == 3){
            System.out.println("Wednesday");
        }else if (day == 4){
            System.out.println("Thursday");
        }else if ( day == 5){
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Saturday");
        }else if(day == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("There is only 7 days in week");
        }

    }

}

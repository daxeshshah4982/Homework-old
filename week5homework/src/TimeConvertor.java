/*Write a Java program to convert seconds to hour, minute and seconds.
        Sample Output:
        Input seconds: 86399
        23:59:59

 */

import java.util.Scanner;

public class TimeConvertor {
    public static void main(String[] args) {
        TimeConvertor tm = new TimeConvertor();
        tm.sth();
        age();
    }

    public void sth() {
        int sec, min, hrs, rem1, rem2;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter seconds : ");
        sec = scr.nextInt();
        rem1 = sec % 60;
        min = sec / 60;
        rem2 = min % 60;
        hrs = min / 60;
        System.out.println(hrs + " : " + rem2 + " : " + rem1);
    }

    public static void age(){
        int sec, min ,hrs,day,month,year, rem1,rem2,rem3,rem4,rem5;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter seconds : ");
        sec = scr.nextInt();
        rem1 = sec%60;
        min = sec/60;
        rem2 = min%60;
        hrs = min/60;
        rem3 = hrs%24;
        day = hrs/365;
        rem4 = day%365;
        month = day/12;
        rem5 = month%12;
        year = month/12;
        System.out.println(year +" years "+ rem5 +" months " + rem4 +" days "+ rem3 +" hrs "+ rem2 +" mins "+rem1 +" seconds");
    }
}

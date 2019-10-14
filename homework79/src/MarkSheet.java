
import javax.swing.*;
import java.util.Scanner;

/*Write a java program to input student Name, roll No, and three subjects Math, Science
and English marks (marks is between 0 to 100 and if it is out of range print error message
“Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass&gt;=35) and also give them grade
&gt;= 80 A+, &gt;= 60 A, &gt;= 50 B, &gt;= 35 C And print Mark Sheet
 */
public class MarkSheet {
    public static void main(String[] args) {
        student();
    }

    private static void student() {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Student's name : ");
        String name = scr.next();
        System.out.print("Enter Student's roll no. : ");
        int rollNo = scr.nextInt();
        int maths = 0, science = 0, english = 0, total = 0;
        boolean bool = false;
        String result = null;
        String grade = null;


        for (int i = 1; bool = false; i++) {

            do {
                System.out.println("marks need to be between 0 and 100");
                System.out.print("Maths : ");
                maths = scr.nextInt();

            } while (maths < 0 || maths > 100);
            do {
                System.out.println("marks need to be between 0 and 100");
                System.out.print("english : ");
                english = scr.nextInt();
            } while (english < 0 || english > 100);
            do {
                System.out.println("Marks need to be between 0 and 100");
                System.out.print("Science : ");
                science = scr.nextInt();
            } while (science < 0 || science > 100);


            total = maths + english + science;
            double percentage = (100 * total) / 300;

            if (maths < 35 || science < 35 || english < 35) {
                result = "Fail";
                grade = "Fail";
            } else {
                if (percentage >= 80) {
                    result = "Pass";
                    grade = "A++";
                } else if (percentage >= 60) {
                    result = "Pass";
                    grade = "A";
                } else if (percentage >= 50) {
                    result = "Pass";
                    grade = "B";
                } else if (percentage >= 35) {
                    result = "Pass";
                    grade = "C";
                }

            }


            System.out.println("|-------------------------------------------|");
            System.out.println("|                 Mark Sheet                |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|     Name      :        " + name + "             |");
            System.out.println("|     Roll No   :        " + rollNo + "                 |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|     Subjects  :          Marks            |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|     Maths     :        " + maths + "                 |");
            System.out.println("|     Science   :        " + science + "                 |");
            System.out.println("|     English   :        " + english + "                 |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|     Total     :        " + total + "                |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|     Percentage:        " + percentage + "               |");
            System.out.println("|     Result    :        " + result + "               |");
            System.out.println("|     Grade     :        " + grade + "                |");
            System.out.println("|-------------------------------------------|");


        }
    }

}
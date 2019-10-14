
import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Marksheet ob = new Marksheet();
        ob.result();
    }

    void result() {
        Scanner in = new Scanner(System.in);
        int roll_no, ma = 0, sc = 0, en = 0;
        float total, per;
        String result = null, grade = null, name;
        boolean con = false;

        System.out.print("Enter Roll No : ");
        roll_no = in.nextInt();
        System.out.print("Enter your First name : ");
        name = in.next();

        {
            {
                {
                    for (int j = 0; con == false; j++) {
                        System.out.print("Enter Marks of Maths  : ");
                        ma = in.nextInt();
                        if ((ma < 0) || (ma > 100)) {
                            System.out.println("Invalid Input, Marks should between 0 to 100 ");
                            con = false;
                        } else {
                            con = true;
                        }
                    }
                }
            }
        }
        {
            {
                for (int k = 0; con == false; k++) {
                    System.out.print("Enter Marks of Science  : ");
                    sc = in.nextInt();
                    if ((sc < 0) || (sc > 100)) {
                        System.out.println("Invalid Input, Marks should between 0 to 100 ");
                        con = false;
                    } else {
                        con = true;
                    }
                }
            }
        }
        {
            for (int l = 0; con == false; l++) {
                System.out.print("Enter Marks of English : ");
                en = in.nextInt();

                if (((en < 0) || (en > 100))) {
                    System.out.println("Invalid Input, Marks should between 0 to 100 ");
                    con = false;
                } else {
                    con = true;
                }
            }
        }

        total = ma + sc + en;
        per = (100 * total) / 300;

        if (ma < 35 || sc < 35 || en < 35) {
            result = "Fail";
            grade = "Fail";
        } else {
            if (per >= 80) {
                result = "Pass";
                grade = "A+";
            } else if (per >= 60) {
                result = "Pass";
                grade = "A";
            } else if (per >= 50) {
                result = "Pass";
                grade = "B";
            } else if (per >= 35) {
                result = "Pass";
                grade = "C";
            }
        }

        System.out.println("_____________________________________________");
        System.out.println("|                Marksheet                   |");
        System.out.println("|       Name         " + name + "                     |");
        System.out.println("|        " + roll_no);
        System.out.println("Subjects      :     Marks");
        System.out.println("Maths         :     " + ma);
        System.out.println("Science       :     " + sc);
        System.out.println("English       :     " + en);
        System.out.println("Total         :     " + total);
        System.out.println("Percentage    :     " + per);
        System.out.println("Result        :     " + result);
        System.out.println("Grade         :     " + grade);
    }
}




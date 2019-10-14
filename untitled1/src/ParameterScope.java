import java.util.Scanner;

public class ParameterScope {
    public static void main(String[] args) {
        Marksheet ob = new Marksheet();
        ob.result();
    }

    private void result() {
        Scanner in = new Scanner(System.in);
        int roll_no, ma=0, sc=0, en=0;
        float total, per;
        String result = null, grade = null, name;
        boolean con = false;

        System.out.print("Enter Roll No : ");
        roll_no = in.nextInt();
        System.out.print("Enter your First name : ");
        name = in.next();

        for (int i = 1; con == false; i++) {
            System.out.print("Enter Marks of Maths  : ");
            ma = in.nextInt();
            System.out.print("Enter Marks of Science : ");
            sc = in.nextInt();
            System.out.print("Enter Marks of English : ");
            en = in.nextInt();

            if (((ma < 0) || (ma > 100)) || ((sc < 0) || (sc > 100)) || ((en < 0) || (en > 100))) {
                System.out.println("Invalid Input, Marks should between 0 to 100 ");
                con = false;
            } else {
                con = true;
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
            }
            else if(per >= 35){
                result = "Pass";
                grade = "C";
            }
        }

        System.out.println("_____________________________________________");
        System.out.println("|                Marksheet                   |");
        System.out.println("|       Name         " +name +"                     |");
        System.out.println("|        " +roll_no);
        System.out.println("Subjects      :     Marks");
        System.out.println("Maths         :     " +ma);
        System.out.println("Science       :     " +sc);
        System.out.println("English       :     " +en);
        System.out.println("Total         :     " +total);
        System.out.println("Percentage    :     " +per);
        System.out.println("Result        :     " +result);
        System.out.println("Grade         :     " +grade);
    }
}


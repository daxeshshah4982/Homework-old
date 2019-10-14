import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
 */
public class SalarySlip {
    public static void main(String[] args) {
        salary();
    }

    public static void salary() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter an employee id : ");
        int _EmployeeID = scr.nextInt();
        System.out.println("Enter an employee name : ");
        String name = scr.next();
        System.out.println("Enter basic salary of employee");
        float _BasicSalary = scr.nextFloat();
        float _HRA, _TA, _DA, _PF, _GrossSalary;
        _HRA = 10 * _BasicSalary / 100;
        _DA = 8 * _BasicSalary / 100;
        _TA = 9 * _BasicSalary / 100;
        _PF = 20 * _BasicSalary / 100;
        _GrossSalary = _BasicSalary + _HRA + _TA + _DA - _PF;
        System.out.println("____________________________________________");
        System.out.println("|               Salary Slip                |");
        System.out.println("____________________________________________");
        System.out.println("| Employee Id        : " + _EmployeeID + "               |");
        System.out.println("| Employee Name      :  " + name + "                |");
        System.out.println("____________________________________________");
        System.out.println("| Basic Salary       : " + _BasicSalary + "  |");
        System.out.println("| HRA 10%            : " + _HRA + "          |");
        System.out.println("| TA   8%            : " + _TA + "          |");
        System.out.println("| DA   9%            : " + _DA + "          |");
        System.out.println("| PF  20%            : " + _PF + "          |");
        System.out.println("____________________________________________");
        System.out.println("| Gross Salary       : " + _GrossSalary + " |");
        System.out.println("____________________________________________");


    }


}
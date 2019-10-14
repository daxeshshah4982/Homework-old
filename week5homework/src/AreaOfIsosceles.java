import java.util.Scanner;

/*4.Java Program To Find Area Of Isosceles Triangle and use below formula.
[ B/4√((4*a*a)-(b*b)) ]
 */
public class AreaOfIsosceles {
    public static void main(String[] args) {
        Ar();
    }

    public static void Ar() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the length of two equal sides a : ");
        double a = scr.nextDouble();
        System.out.print("Enter the base length b : ");
        double b = scr.nextDouble();
        double h = Math.sqrt((4*(a*a)- (b*b))/4);
        double area = (b * h) /2;
        System.out.println(" Area if isosceles triangle is = " +area);



    }
}

import java.util.Scanner;

/*Java Program to enter the radius and height of cylinder and Calculate Total Surface Area
Of Cylinder and use below formula.
TSA=2pi*r*r + 2pi*r*h
 */
public class SurfaceArea {
    public static void main(String[] args) {
        SurfaceArea sf = new SurfaceArea();
        sf.sa();
    }
    public void sa(){
        double pi = 3.14;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter radius of cylinder r : ");
        double r = scr.nextDouble();
        System.out.print("Enter height of cylinder h : ");
        double h = scr.nextDouble();
        double totalsurfacearea = 2 * pi * r * r + 2 * pi * r * h;
        System.out.print(" Total surface area of cylinder is = "+totalsurfacearea);
    }
}

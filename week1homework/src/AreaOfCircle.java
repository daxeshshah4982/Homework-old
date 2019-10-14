import java.util.Scanner;

public class AreaOfCircle {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = 0.0;
        System.out.println("Enter the radius : " );
        radius = scanner.nextDouble();
        // as the radius variable is taken double, return value is scanner.nextdouble(); is taken.
        // if we take int instead of double, return value have to take scanner.nextint();

        double area ;
        area  =  Math.PI * radius * radius;

        System.out.println("Area of circle = " +area);
    }


}

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int base ;
        double height ;
        double area ;

        System.out.println("enter length of base of triangle = " );
        base = scanner.nextInt();
        System.out.println("enter length of height of triangle = ");
        height = scanner.nextDouble();
        area = (base * height )/2;
        System.out.println("Area of triangle = " +area);
    }
}

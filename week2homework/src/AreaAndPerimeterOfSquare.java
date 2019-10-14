import java.util.Scanner;

public class AreaAndPerimeterOfSquare {
    public static void main(String[] args) {
        double l;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value of length = ");
        l = scanner.nextDouble();
        double area = l * l;
        double perimeter = 4 * l;
        System.out.println(" Area of square of length " + l + " = " + area);
        System.out.println(" Perimeter of square of length " + l + " = " + perimeter);


    }
}

import java.util.Scanner;

/*WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find
addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class MathsSymbol {
    public static void main(String[] args) {
        symbol1();
        symbol2();
    }

    public static void symbol1() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter any no a : ");
        double a = scr.nextDouble();
        System.out.print("Enter any no b : ");
        double b = scr.nextDouble();
        System.out.print("Enter any operator from + , - , /  and * : ");
        String operator = scr.next();

        if (operator.equals("+")) {
            double c = a + b;
            System.out.println("a + b  = " + c);
        } else if (operator.equals("-")) {
            double d = a - b;
            System.out.println("a - b = " + d);
        } else if (operator.equals("*")) {
            double e = a * b;
            System.out.println("a * b = " + e);
        } else if (operator.equals("/")) {
            double f = a / b;
            System.out.println("a / b = " + f);
        } else {
            System.out.println(" Operation is not valid ");
        }


    }

    public static void symbol2() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter first no. a : ");
        double a = scr.nextDouble();
        System.out.print("Enter second no. b : ");
        double b = scr.nextDouble();
        System.out.print("Enter any operator from + , - , * and / : ");
        String operator = scr.next();

        switch (operator) {
            case "+":
                double c = a + b;
                System.out.println("a + b = " + c);
                break;
            case "-":
                double d = a - b;
                System.out.println("a-b = " + d);
                break;
            case "*":
                double e = a * b;
                System.out.println(" a * b = " + e);
                break;
            case "/":
                double f = a / b;
                System.out.println(" a / b  = " + f);
                break;
            default:
                System.out.println("Operation in not allowed");

        }

    }
}

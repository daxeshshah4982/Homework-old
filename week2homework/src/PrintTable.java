import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a no. you want to print table " );
         a = scanner.nextInt();
        for(int b =1; b<=10; b++){
            System.out.println( a + " * " + b + " = " + a * b );
        }
    }
}

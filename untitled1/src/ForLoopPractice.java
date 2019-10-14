import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        flop();
    }
    public static void flop(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter any no for you want to print a table = ");
        int j = scr.nextInt();

        for(int i=1; i<=10; i++){


                System.out.println( j +" x " + i + " = " + j * i   );

        }
    }

}

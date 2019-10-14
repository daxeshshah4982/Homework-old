import java.util.Scanner;

/*WAP to input any number and find out if it’s odd or even
 */
public class OddEven {
    public static void main(String[] args){
        oe();
    }
    public static void oe(){
        System.out.print(" Enter any no. : ");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        if(n%2 == 0){
            System.out.println( n +" is an even no.");
        }else{
            System.out.println(n +" is an odd no.");
        }
    }
}

import java.util.Scanner;

/*WAP input sales id, seller's name, sales amount, and salary basic and then fined this
sales Commission
Sales amount &gt;= 50,000 35%
Sales amount &gt;= 30,000 20%
&gt;= 20,000 10%
&gt;= 10,000 5%
&lt; 10,000 2%
 */
public class SalesCommission {
    public static void main(String[] args) {
        salcom();
    }
    private static void salcom() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Seller's Id no. : ");
        int id = scr.nextInt();
        System.out.println("Enter Seller's name : ");
        String name = scr.next();
        System.out.println("Enter the amount of stock sale : ");
        int amount = scr.nextInt();
        System.out.println("Enter seller's basic salary : ");
        int basic = scr.nextInt();
        int commission = 0;
        if(amount>=50000){
            commission = (35 * amount)/100;
        }else if(amount >= 30000){
            commission = (20 * amount)/100;
        }else if(amount>=20000 ){
            commission = (10 * amount )/100;
        }else if (amount>=10000){
            commission = (5 * amount)/100;
        }else {
            commission = ( 2 * amount)/100;
        }
        int total = basic + commission;
        System.out.println(" -------------monthly salary------------");
        System.out.println("Name             : "+name+"                  ");
        System.out.println("Id               : "+id+"                   ");
        System.out.println("Basic salary     : "+basic+"                  ");
        System.out.println("Sales commission : "+ commission +"                ");
        System.out.println("Total salary     : "+total +"         ");
    }
}

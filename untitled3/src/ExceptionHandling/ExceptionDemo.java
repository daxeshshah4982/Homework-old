package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        try {                                          //try block contain risky code of the programme
            acc.withdraw(100);
            System.out.println("after trying the withdraw method");
        }catch (Exception e){                         // catch code contains handling code of programme
                                                      // here Exception is Exception-name and e is variable
            e.printStackTrace();
            System.out.println("Try again at some other point");
        }finally {                                   //finally contains clean up code and it always executes
            System.out.println("Always executes");
        }
    }
}

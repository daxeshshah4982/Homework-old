/* Declare 1 static and 1 instance variable outside main method
declare main method
call below two method in main method
declare one instance method and call those 2 variables
declare one static method and call those two variables
 */
public class Programme3 {
    int a = 20;
    static int b = 30;
    public static void main(String[] args) {
        Programme3 p = new Programme3();
        p.add();
        sub();
    }
    public void add() {
        System.out.print("a + b = " );
        System.out.println(a+b);
        // even didn't call the class but still static variable worked fine in instance area.
        System.out.println("");
        System.out.print("a+b=");
        System.out.println(a + Programme3.b);
       // System.out.println("a * b = " + a * Programme3.b);
       // System.out.println("a / b = " + a / Programme3.b);
    }
    public static void sub() {
        Programme3 p1 = new Programme3();
        System.out.println("");
        System.out.print("b - a = ");
        System.out.println(Programme3.b - p1.a);
        System.out.println(b-p1.a);
    }

}
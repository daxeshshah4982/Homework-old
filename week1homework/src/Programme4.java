/* Declare 2 static and 2 instance variable outside main method
declare main method
call below two method in main method
declare one instance method and call those 4 variables
declare one static method and call those 4 variables
 */



public class Programme4 {
    int a = 10;
    int b = 500;
    static int c = 60;
    static int d = 800;

    public static void main(String[] args) {
        System.out.println("Multiplication and Division");
        mp();
        Programme4 p = new Programme4();
        p.div();

    }


    public static void mp() {
        Programme4 p1 = new Programme4();
        System.out.print("a*b = ");
        System.out.println(p1.a * p1.b);
        System.out.print("a*b*c = ");
        System.out.println(p1.a * p1.b * p1.c);
        System.out.print("b*d*c = ");
        System.out.println(p1.b * d * c);
        System.out.print("a*b*c*d = ");
        System.out.println(p1.a * p1.b * c * d);

    }

    public void div() {
        Programme4 p2 = new Programme4();
        System.out.print("d/c = ");
        System.out.println(p2.d / p2.c);
        System.out.print("d/a = " );
        System.out.println(p2.d/a);
        System.out.print("b/a = " );
        System.out.println(b/a);

         }
    }

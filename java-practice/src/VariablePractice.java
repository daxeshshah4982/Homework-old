import com.sun.org.apache.xpath.internal.operations.Variable;

public class VariablePractice {

    int a = 10;
    int b = 20;
    static int c = 30;
    static String name = "Prime Testing";

    public static void main(String[] args) {
        // This is called static area

        System.out.println("Starting");
        System.out.println("Ending");
        VariablePractice vp1 = new VariablePractice();

        System.out.println("");
        vp1.add();
        sub();

    }

    public void add() {
        // this is called instance area
        System.out.println("Prime");
        System.out.println(a);
        System.out.println("Testing");
    }

    public static void sub() {
        //this is called static area.
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(c);
        System.out.println(VariablePractice.c);
        System.out.println(VariablePractice.name);
        VariablePractice vp2 = new VariablePractice();
        System.out.println(vp2.a);
        System.out.println(vp2.b);


    }
}

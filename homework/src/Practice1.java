public class Practice1{


    int a = 500;
    float b = 200.5f;
    double c = 300.50;

    static int d = 300;
    static float e = 50.5f;
    static double f = 10.70;

    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        p1.add();
        sub();


    }

    public void add() {
        System.out.println(a + b);
        System.out.println(b + c);
        System.out.println(a + b + c);

        //Programme3 p2 = new Programme3();
        System.out.print("d+e = ");
        System.out.println(Practice1.d + Practice1.e);
        System.out.print("d+e+f = ");
        // System.out.println((p2.d) + (p2.e) + (p2.f));

    }

    public static void sub() {
        Programme3 p3 = new Programme3();
        System.out.println(p3.a);
        System.out.println(p3.b);
        System.out.println(p3.c);
        System.out.print("a-b = ");
        System.out.println((p3.a) - (p3.b));
        System.out.print("a-b-c = ");
        System.out.println((p3.a) - (p3.b) - (p3.c));
        System.out.print("a-b+c = ");
        System.out.println((p3.a) - (p3.b) + (p3.c));

        System.out.print("d-e-f = ");
        System.out.println(d-e-f);


    }
}
 {
}

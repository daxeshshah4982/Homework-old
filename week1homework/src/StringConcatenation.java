/* write a program for calculator with addition subtraction multiplication and division method all with
parameters and use string concatenation methods
2 methods should be static and 2 methods are instance
 */
//  Write this programme by using youtube videos.Not sure what to follow as per requirement. Thanks.
public class StringConcatenation {
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    String str1 = "Daxesh";
    String str2 = "Shah";

    int e;
    int f;


    public static void main(String[] args) {
        StringConcatenation sc = new StringConcatenation();
        sc.add();
        mul();
    }

    public void add() {
        System.out.println("a + b = " + a + b);
        System.out.println("a + b + c + d = " + a + b + c + d);
        System.out.println("c + d + str1 + str2= " + c + d + str1 + str2);
        System.out.println("a+b+c+d+str1+str2 = " + a + b + c + d + str1 + str2);
        System.out.println("a+b+str1+c+d+str2 = " + a + b + str1 + c + d + str2);
        System.out.println("str1+a+b+c+d+str1+str2 = " + str1 + a + b + c + d + str1 + str2);
        System.out.println("str1+(a+b+c)+d+str1+str2 = " + str1 + (a + b + c) + d + str1 + str2);
        System.out.println("str1+(a+b)+c+d+str1+str2 = " + str1 + (a + b) + (c + d + str1) + str2);
        System.out.println("str1* str2 = " + str1 + " " + str2);

        // System.out.println("e+f " = + e+f);
        System.out.println("");
    }

    public static void mul() {

        System.out.println("c * d = " + c * d);
        StringConcatenation sc1 = new StringConcatenation();

        System.out.println("a * b = " + sc1.a * sc1.b);
    }
}

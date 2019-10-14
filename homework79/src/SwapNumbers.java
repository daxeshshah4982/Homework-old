/*WAP to input any two numbers and then print their interchanged value
 */
public class SwapNumbers {
    private static int a;
    private static int b;

    public static void main(String[] args) {
        swap(10, 15);
    }

    private static void swap(int a, int b) {

        System.out.println("before swapping a = " + a + " and b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a = " + a + " and b = " + temp);
    }
}


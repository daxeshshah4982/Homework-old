/*WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
public class Division {
    public static void main(String[] args) {
        div3();
        div5();
    }

    public static void div3() {
        System.out.println("No.s divisible by 3 are : ");
        for (int i = 1; i <= 100; i++) {
            int rem1 = i % 3;
            if (rem1 == 0) {
                System.out.print(i + " , ");
            }
        }
    }

    public static void div5() {
        System.out.println(" ");
        System.out.println("No.s divisible by 5 are : ");
        for (int j = 1; j <= 100; j++) {
            int rem2 = j % 5;
            if (rem2 == 0) {
                System.out.print(j + " , ");
            }
        }
    }
}
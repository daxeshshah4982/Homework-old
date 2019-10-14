package ExceptionHandling;

public class RunTimeExceptionDemo {
    public static void main(String[] args) {
        runtimeexception1();
        runtimeexception2();
    }

    public static void runtimeexception1() {
        int a = 10;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println("The result is : " + c);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void runtimeexception2() {
        int[] numbers = {10, 20, 30};
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(numbers[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
}

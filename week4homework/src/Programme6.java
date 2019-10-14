// nos divisible by 3 and 5 and both by using while loop

public class Programme6 {
    public static void main(String[] args) {
        d3and5();
        d3();
        d5();

    }

    public static void d3() {
        System.out.println("Nos divisible by 3");
        int a = 1;
        while (a <= 100) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
    public static void d5(){
        System.out.println("Nos divisible by 5");
        int b = 1;
        while (b<=100){
            if(b%5 == 0){
                System.out.println(b);
            }
            b++;
        }
    }
    public static void d3and5(){
        System.out.println("Nos divisible by 15");
        int c = 1;
        while (c<=100){
            if (c%15 == 0){
                System.out.println(c);
            }
            c++;
        }
    }
}

/*Write a Java program to print numbers between 1 to 100 which are
        divisible by 3, 5 and by both.
*/
public class Programme5 {
    public static void main(String[] args) {
        div3();
        Programme5 p5 = new Programme5();
        p5.div5();
        div3and5();
    }

    public static void div3() {
        System.out.println("Nos. divisible by 3");
        int i;
        int rem1;
        for (i = 1; i <= 100; i++) {
            rem1 = i % 3;
            if (rem1 == 0) {
                System.out.println(i);
            }
        }
    }
    public void div5(){
        System.out.println("Nos. Divisible by 5");
        int j;
        int rem2;
        for(j=1; j<=100;j++){
            rem2 = j%5;
            if (rem2 == 0){
                System.out.println(j);
            }
        }
    }

    public static void div3and5(){
        System.out.println("Nos. Divisible by 3 and 5");
        int k;
        int rem3;
        for(k=1;k<=100;k++){
            rem3 = k%15;
            if (rem3 == 0){
                System.out.println(k);
            }
        }
    }
}
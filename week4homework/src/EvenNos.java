// first 50 even nos.

public class EvenNos {
    public static void main(String[] args) {
        EvenNos e = new EvenNos();
        e.evens();
    }
    public void evens(){
        int a;
        System.out.println("first 50 even nos. are");
        for (a=1; a<=50; a++){
            System.out.print(2*a + ",");

        }

        int b=1;
        System.out.println();
        System.out.println("first 50 even nos. are");
        while (b<=50){
            System.out.print(2*b +",");
            b++;
        }

    }
}

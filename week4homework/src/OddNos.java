/*Write a Java program to print the odd numbers from 1 to 99. Prints one
number per line.
*/


public class OddNos {

    public static void main(String[] args) {
        odds();
    }

    public static void odds() {

        //using for loop
       int i;
        System.out.println("odd nos. between 1 and 100 are");
        for (i = 1; i <= 50; i++) {
            //System.out.println("odd nos. between 1 and 100 are"); // here if we will write this here than every time
                       //  it will repeat same sentence so write it before loop started

            System.out.print(2 * i - 1 + ",");

        }


        //using while loop
        System.out.println();   // using this to keep space between two loops
        int j = 1;
        System.out.println("odd nos. between 1 and 100 are");
        while (j <= 50) {
            System.out.print(2 * j - 1 + ",");
            j++;
        }

    }
}

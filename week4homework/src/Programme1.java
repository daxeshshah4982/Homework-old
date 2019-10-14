/*Write a Java program to print the following string in a specific format (see
        the output
        Twinkle, twinkle, little star,
         How I wonder what you are!
        Up above the world so high,
          Like a diamond in the sky.

        Twinkle, twinkle, little star,
         How I wonder what you are
*/
public class Programme1 {
    public static void main(String[] args) {
        Programme1 pr = new Programme1();
        pr.print();

    }

    public void print() {
        String str1 = "twinkle, twinkle, little star,";
        String str2 = "How I wonder what you are!";
        String str3 = "Up above the world so high,";
        String str4 = "Like a diamond in the sky.";

        System.out.println(str1);
        System.out.println("       " + str2);
        System.out.println("                " + str3);
        System.out.println("                " + str4);
        System.out.println(" ");
        System.out.println(str1);
        System.out.println("       " +str2);

    }
}

import java.util.Scanner;

public class Consonant {

    public static void main(String[] args) {
        sumDigit();
    }

    public static void sumDigit() {
        int sum = 0;
        int rem = 0;
        System.out.println(" Enter any no : ");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        rem = number;
        if (rem <= 1) {
            System.out.println(-1);
        } else {
            while (number >= 10 && rem > 1) {
                rem = number % 10;
                sum = rem + sum;
                number = number / 10;
            }
            sum = sum + number;
            System.out.println(sum);
        }
    }
}




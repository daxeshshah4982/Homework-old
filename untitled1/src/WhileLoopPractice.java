public class WhileLoopPractice {

    public static void main(String[] args) {
        noprint6();
        wlop();
    }

    public static void wlop() {
        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.print(i + ",");

            }
            i++;
        }

    }

    public static void noprint6() {
        int i = 1;
        while (true) {
            if (i != 6) {
                System.out.println(i);
            }
            i++;

            if (i == 11) {
                break;
            }
        }
    }

}

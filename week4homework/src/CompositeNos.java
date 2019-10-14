/* write a programme for composite nos. between 1 and 100 */

public class CompositeNos {
    public static void main(String[] args) {
        CompositeNos cm = new CompositeNos();
        cm.com();
    }

    public void com() {
        for (int i = 1; i <= 100; i++) {
            //  boolean flag = true;                    // this programme is same like prime no.s but in this programme
            for (int j = 2; j <= i - 1; j++) {         // we don't need to define boolean as we need i%j = 0
                if (i % j == 0) {                     // and cannot define =/= 0 in prime nos that's why we used boolean
                    // flag = true;                    // so we can make another (if loop} by using boolean variable
                    System.out.print(i + ",");         // compare both programmes
                    break;
                }

            }
        }

    }
}

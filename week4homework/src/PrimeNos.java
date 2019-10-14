// define prime nos between 1 and 100

public class PrimeNos {
    public static void main(String[] args) {
        PrimeNos pm = new PrimeNos();
        pm.prim();

    }

    public void prim() {
        int i, j, rem;
        //here i gets the value 1 to 100 whereas j will take 2 to i-1
        // so if i = 32 than j will take values from 2 to 31


        for (i = 1; i <= 100; i++) {              //what is the reason to define flag?
            Boolean flag = true;                 // why do we have to define this flag variable under the for loop only?
            for (j = 2; j <= i - 1; j++) {          // when defined in prim method its giving different result
                rem = i % j;
                if (rem == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.print(+i +" , ");

            }


       /*
      for (int a =1; a<=100; a++){
          for (int b=2; b<=a-1; b++){
              if (a%b != 0){                    // why can't a%b does not equal to working properly?
                  System.out.print(a + ",");
                  break;

              }
          }
          */
    }
}
}

public class ArrayPractice {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        System.out.println(a[0]);
        String[] b = {"Daxesh","Ganesh","Vasu","Tejas","Sandeep"};

        int size = a.length;
        System.out.println(size);

        for (int i = 0; i < size ; i++) {
            System.out.println(a[i]);

        }
        System.out.println(a[1]+a[3]+a[2]+2 *a[0]);
        System.out.println(b[2]);




    }
}

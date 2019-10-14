package Collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();

        // Adding
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Audi");
        carList.add("Ford");

        //Size
        int size = carList.size();
        System.out.println(size);

        //get
        System.out.println(carList.get(1));

        //iteration from for loop
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }
        // advance for loop is nothing but-- for each loop

        System.out.println("\n  Next for loop example");
        for (String car: carList) {
            System.out.println("The item is " +car);

        }
        // remove
        System.out.println("\n after remove");
        carList.remove(size-1);
        for (String car: carList) {
            System.out.println("The item is " + car);
        }
    }
}

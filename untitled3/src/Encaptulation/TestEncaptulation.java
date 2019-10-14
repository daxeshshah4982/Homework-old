package Encaptulation;

import Interfaces.BMWCarsInterface;
import Interfaces.CarsInterface;

public class TestEncaptulation {
    public static void main(String[] args) {
        EncaptulationDemo ecd = new EncaptulationDemo(82,"Daxesh");
        System.out.println(ecd.getId());
        System.out.println(ecd.getName());
        ecd.setId(52);
        ecd.setName("Anjana");
        System.out.println(ecd.getId());
        System.out.println(ecd.getName());
    }
}

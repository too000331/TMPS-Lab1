package com;

import com.Factory.*;

public class Main {

    public static void main(String[] args) {
        BaseFactory fordFactory = FordFactory.getFordFactory();
        System.out.println(fordFactory.createCars("sedan").toString());
        System.out.println(fordFactory.createCars("pickup truck").toString());
        System.out.println(fordFactory.createCars("minivan").toString());

        BaseFactory mercedesFactory = MercedesFactory.getMercedesFactory();
        System.out.println(mercedesFactory.createCars("sedan").toString());
        System.out.println(mercedesFactory.createCars("pickup truck").toString());
        System.out.println(mercedesFactory.createCars("minivan").toString());

        BaseFactory toyotaFactory = ToyotaFactory.getToyotaFactory();
        System.out.println(toyotaFactory.createCars("sedan").toString());
        System.out.println(toyotaFactory.createCars("pickup truck").toString());
        System.out.println(toyotaFactory.createCars("minivan").toString());

        BaseFactory volkswagenFactory = VolkswagenFactory.getVolkswagenFactory();
        System.out.println(volkswagenFactory.createCars("sedan").toString());
        System.out.println(volkswagenFactory.createCars("pickup truck").toString());
        System.out.println(volkswagenFactory.createCars("minivan").toString());

    }
}

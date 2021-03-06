package com.Cars;

public class PickupTruck implements Cars {
    private String name;
    private String brand;
    private float price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PickupTruck: " +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price + "€;";
    }
}

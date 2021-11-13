package com.Cars;

public class Sedan implements Cars {
    private String name;
    private String brand;
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sedan: " +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price + "€;";
    }
}

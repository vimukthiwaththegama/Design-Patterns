package com.builder;

public class Phone
{ private String brand;
    private String model;
    private String color;
    private double screenSize;
    private double price;
    private String processorName;

    public Phone( String brand, String color, String model, double price, String processorName, double screenSize )
    {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.price = price;
        this.processorName = processorName;
        this.screenSize = screenSize;
    }

    public Phone( String brand, double screenSize, String processorName, String model, String color, double price )
    {
        this.brand = brand;
        this.screenSize = screenSize;
        this.processorName = processorName;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Smartphone{" +
                       "brand='" + brand + '\'' +
                       ", model='" + model + '\'' +
                       ", color='" + color + '\'' +
                       ", screenSize=" + screenSize +
                       ", price=" + price +
                       ", processorName='" + processorName + '\'' +
                       '}';
    }

}

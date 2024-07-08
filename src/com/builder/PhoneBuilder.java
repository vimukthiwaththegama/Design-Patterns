package com.builder;

public class PhoneBuilder
{
    private String brand;
    private String model;
    private String color;
    private double screenSize;
    private double price;
    private String processorName;

    public PhoneBuilder setBrand( String brand )
    {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setScreenSize( double screenSize )
    {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setProcessorName( String processorName )
    {
        this.processorName = processorName;
        return this;
    }

    public PhoneBuilder setPrice( double price )
    {
        this.price = price;
        return this;
    }

    public PhoneBuilder setModel( String model )
    {
        this.model = model;
        return this;
    }

    public PhoneBuilder setColor( String color )
    {
        this.color = color;
        return this;
    }

    public Phone getPhone(){
        return new Phone( brand,color,model,price,processorName,screenSize );
    }
}

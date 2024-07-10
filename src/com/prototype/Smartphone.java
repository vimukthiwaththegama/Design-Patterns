package com.prototype;

public class Smartphone
{
    String brandName;
    String model;
    String price;

    public String getBrandName()
    {
        return brandName;
    }

    public void setBrandName( String brandName )
    {
        this.brandName = brandName;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel( String model )
    {
        this.model = model;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice( String price )
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Smartphone{" +
                       "brandName='" + brandName + '\'' +
                       ", model='" + model + '\'' +
                       ", price='" + price + '\'' +
                       '}';
    }
}

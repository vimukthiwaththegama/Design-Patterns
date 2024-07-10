package com.composite;

public class ComputerLeaf implements Part
{
    int price;

    public ComputerLeaf( String name, int price )
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice( int price )
    {
        this.price = price;
    }

    String name;
    @Override
    public void showPrice(){
        System.out.println("Price is :"+price+" The name is :"+name);
    }
}

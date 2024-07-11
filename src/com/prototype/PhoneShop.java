package com.prototype;

import java.util.List;

public class PhoneShop implements Cloneable
{
    private String shopName;
    private List<Smartphone> phoneList;

    public List<Smartphone> getPhoneList()
    {
        return phoneList;
    }

    public void setPhoneList( List<Smartphone> phoneList )
    {
        this.phoneList = phoneList;
    }

    public String getShopName()
    {
        return shopName;
    }

    public void setShopName( String shopName )
    {
        this.shopName = shopName;
    }

    @Override
    public String toString()
    {
        return "PhoneShop{" +
                       "phoneList=" + phoneList +
                       ", shopName='" + shopName + '\'' +
                       '}';
    }

    @Override
    public PhoneShop clone()
    {
        try
        {
            PhoneShop clone = ( PhoneShop ) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        }
        catch( CloneNotSupportedException e )
        {
            throw new AssertionError();
        }
    }
}

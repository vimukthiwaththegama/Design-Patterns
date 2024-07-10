package com.prototype;

import java.util.List;

public class PhoneShop
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
}

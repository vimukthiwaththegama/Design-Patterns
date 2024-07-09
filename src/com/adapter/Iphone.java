package com.adapter;

public class Iphone
{
    private Cable cable;

    public Cable getCable()
    {
        return cable;
    }

    public void setCable( Cable cable )
    {
        this.cable = cable;
    }
    public void chargePhone(String chargingNote){
        cable.charge( chargingNote );
    }
}

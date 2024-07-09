package com.adapter;

public class ChargingAdapter implements Cable
{
    TypeCcable typeCcable = new TypeCcable();
    @Override
    public void charge(String chargingNote){
        typeCcable.typeCChargingNote( chargingNote );
    }
}

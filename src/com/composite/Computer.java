package com.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Computer implements Part
{
    String name;
    List<Part> computerLeafList = new ArrayList<>();


    public void addComponents(Part part  ){
        computerLeafList.add( part );
    }
    @Override
    public void showPrice(){
      for(Part computerLeafs:computerLeafList){
        computerLeafs.showPrice();
    }
    }
}

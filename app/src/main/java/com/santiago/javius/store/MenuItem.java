package com.santiago.javius.store;

import android.view.Menu;

/**
 * Created by Javius on 3/19/2018.
 */

public class MenuItem
{
    private String myName;
    private double myPrice;

    public MenuItem()
    {

    }
    public MenuItem(String name, double price)
    {
        myName = name;
        myPrice = price;
    }
    public String getName()
    {
        return myName;
    }
    public double getPrice()
    {
        return myPrice;
    }

}

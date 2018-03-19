package com.santiago.javius.store;

import android.view.Menu;

/**
 * Created by Javius on 3/19/2018.
 */

public class MenuItem
{
    private String myName;
    private double myPrice;

    final double priceBurger = 5.99;
    final double priceFries = 3.99;
    final double priceSoda = 1.99;

    public MenuItem()
    {

    }
    public MenuItem(String name, double price)
    {
        myName = name;
        myPrice = price;
    }

}

package com.santiago.javius.store;

/**
 * Created by Javius on 3/19/2018.
 */

public class Cart
{
    private int numBurgers = 0;
    private int numFries = 0;
    private int numSodas = 0;

    /*final double priceBurger = 5.99;
    final double priceFries = 3.99;
    final double priceSoda = 1.99;*/

    private double myTotal;

    public Cart()
    {

    }
    public void addItem(MenuItem item)
    {
        if (item.getName().equals("Burger"))
        {
            numBurgers++;
        }
        else if (item.getName().equals("Fries"))
        {
            numFries++;
        }
        else if (item.getName().equals("Soda"))
        {
            numSodas++;
        }
    }
    public void removeItem(MenuItem item)
    {
        if (item.getName().equals("Burger"))
        {
            numBurgers--;
        }
        else if (item.getName().equals("Fries"))
        {
            numFries--;
        }
        else if (item.getName().equals("Soda"))
        {
            numSodas--;
        }
    }
    public int getAmountOf(MenuItem item)
    {
        if (item.getName().equals("Burger"))
        {
            return numBurgers;
        }
        else if (item.getName().equals("Fries"))
        {
            return numFries;
        }
        else if (item.getName().equals("Soda"))
        {
            return numSodas;
        }
        return -1;
    }

}

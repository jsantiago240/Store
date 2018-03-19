package com.santiago.javius.store;

/**
 * Created by Javius on 3/19/2018.
 */

public class Cart
{
    private int numBurgers = 0;
    private int numFries = 0;
    private int numSodas = 0;

    final double PRICE_BURGER = 5.99;
    final double PRICE_FRIES = 3.99;
    final double PRICE_SODA = 1.99;

    final double TAX_RATE = 0.06;

    private double mySubtotal;
    private double myTotal;
    private double myTax;

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
    public double getSubtotal()
    {
        mySubtotal = (numBurgers * PRICE_BURGER) + (numFries * PRICE_FRIES) + (numSodas * PRICE_SODA);
        return mySubtotal;
    }
    public double getTax()
    {
        myTax = mySubtotal * TAX_RATE;
        //myTax = Math.round(myTax * 100.0) / 100.0;
        return round(myTax);
    }
    public double getTotal()
    {
        myTotal = mySubtotal + myTax;
        return round(myTotal);
    }
    public double round(double x)
    {
        return Math.round(x*100.0)/100.0;
    }

}

package com.santiago.javius.store;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    ImageView imageBurger;
    ImageView imageFries;
    ImageView imageSoda;

    Button btnCart;

    Cart cart = new Cart();

    MenuItem burger = new MenuItem("Burger", 5.99);
    MenuItem fries = new MenuItem("Fries", 3.99);
    MenuItem soda = new MenuItem("Soda", 1.99);

    TextView textBurgerQuantity;
    TextView textFriesQuantity;
    TextView textSodaQuantity;

    EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBurgerQuantity = findViewById(R.id.textBurgerQuantity);
        textFriesQuantity = findViewById(R.id.textFriesQuantity);
        textSodaQuantity = findViewById(R.id.textSodaQuantity);

        imageBurger = findViewById(R.id.imageBurger);
        imageFries = findViewById(R.id.imageFries);
        imageSoda = findViewById(R.id.imageSoda);

        editName = findViewById(R.id.editName);
        btnCart = findViewById(R.id.btnCart);
    }

    public void btnBuyBurgerClicked(View view)
    {
        Toast.makeText(MainActivity.this, "1 Burger Added To Cart", Toast.LENGTH_LONG).show();
        cart.addItem(burger);
        textBurgerQuantity.setText(cart.getAmountOf(burger) + " burger(s) in cart");
    }
    public void btnRemoveBurgerClicked(View view)
    {
        if (cart.getAmountOf(burger)>0)
        {
            Toast.makeText(MainActivity.this, "1 Burger Removed From Cart", Toast.LENGTH_LONG).show();
            cart.removeItem(burger);
            textBurgerQuantity.setText(cart.getAmountOf(burger) + " burger(s) in cart");
        }
    }

    public void btnBuyFriesClicked(View view)
    {
        Toast.makeText(MainActivity.this, "1 Regular Fry Added To Cart", Toast.LENGTH_LONG).show();
        cart.addItem(fries);
        textFriesQuantity.setText(cart.getAmountOf(fries) + " order(s) of fries in cart");
    }
    public void btnRemoveFriesClicked(View view)
    {
        if (cart.getAmountOf(fries)>0)
        {
            Toast.makeText(MainActivity.this, "1 Reg Fry Removed From Cart", Toast.LENGTH_LONG).show();
            cart.removeItem(fries);
            textFriesQuantity.setText(cart.getAmountOf(fries) + " order(s) of fries in cart");
        }
    }

    public void btnBuySodaClicked(View view)
    {
        Toast.makeText(MainActivity.this, "1 Soda Added To Cart", Toast.LENGTH_LONG).show();
        cart.addItem(soda);
        textSodaQuantity.setText(cart.getAmountOf(soda) + " soda(s) in cart");
    }
    public void btnRemoveSodaClicked(View view)
    {
        if (cart.getAmountOf(soda)>0)
        {
            Toast.makeText(MainActivity.this, "1 Soda Removed From Cart", Toast.LENGTH_LONG).show();
            cart.removeItem(soda);
            textSodaQuantity.setText(cart.getAmountOf(soda) + " soda(s) in cart");
        }
    }


    public void btnCartClicked(View view)
    {
        if(editName.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this, "1 Soda Removed From Cart", Toast.LENGTH_LONG).show();
        }

    }

}

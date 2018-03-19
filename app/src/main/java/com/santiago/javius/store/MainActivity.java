package com.santiago.javius.store;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.VISIBLE;

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

    TextView textBurgerPrice;
    TextView textFriesPrice;
    TextView textSodaPrice;

    Button btnBuyBurger;
    Button btnBuyFries;
    Button btnBuySoda;

    Button btnRemBurger;
    Button btnRemFries;
    Button btnRemSoda;

    EditText editName;
    String username;

    //Cart Screen*********************************************
    LinearLayout layoutReceipt;
    TextView textThanks;

    TextView textNumBurgers;
    TextView textNumFries;
    TextView textNumSodas;

    TextView textSubtotal;
    TextView textTax;
    TextView textTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBurgerQuantity = findViewById(R.id.textBurgerQuantity);
        textFriesQuantity = findViewById(R.id.textFriesQuantity);
        textSodaQuantity = findViewById(R.id.textSodaQuantity);

        textBurgerPrice = findViewById(R.id.textBurgerPrice);
        textFriesPrice = findViewById(R.id.textFriesPrice);
        textSodaPrice = findViewById(R.id.textSodaPrice);

        imageBurger = findViewById(R.id.imageBurger);
        imageFries = findViewById(R.id.imageFries);
        imageSoda = findViewById(R.id.imageSoda);

        btnBuyBurger = findViewById(R.id.btnBuyBurger);
        btnBuyFries = findViewById(R.id.btnBuyFries);
        btnBuySoda = findViewById(R.id.btnBuySoda);

        btnRemBurger = findViewById(R.id.btnRemoveBurger);
        btnRemFries = findViewById(R.id.btnRemoveFries);
        btnRemSoda = findViewById(R.id.btnRemoveSoda);

        editName = findViewById(R.id.editName);
        btnCart = findViewById(R.id.btnCart);

        //Cart Screen****************************************
        layoutReceipt = findViewById(R.id.layoutReceipt);
        textThanks = findViewById(R.id.textThanks);

        textNumBurgers = findViewById(R.id.textNumBurgers);
        textNumFries = findViewById(R.id.textNumFries);
        textNumSodas = findViewById(R.id.textNumSodas);

        textSubtotal = findViewById(R.id.textSubtotal);
        textTax = findViewById(R.id.textTax);
        textTotal = findViewById(R.id.textTotal);
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
            Toast.makeText(MainActivity.this, "Please enter name first", Toast.LENGTH_LONG).show();
        }
        else
        {
            username = editName.getText().toString();
            clearScreen();
            textThanks.setText("Thanks, " + username);
            textThanks.setVisibility(VISIBLE);

            textNumBurgers.setText("Burgers: " + cart.getAmountOf(burger));
            textNumFries.setText("Fries: " + cart.getAmountOf(fries));
            textNumSodas.setText("Sodas: " + cart.getAmountOf(soda));

            textSubtotal.setText("Subtotal: $" + cart.getSubtotal());
            textTax.setText("Tax: $" + cart.getTax() + "");
            textTotal.setText("Total: $" + cart.getTotal()+"");

            layoutReceipt.setVisibility(VISIBLE);
        }

    }

    public void clearScreen()
    {
        imageBurger.setVisibility(View.INVISIBLE);
        textBurgerQuantity.setVisibility(View.INVISIBLE);
        btnBuyBurger.setVisibility(View.INVISIBLE);
        btnRemBurger.setVisibility(View.INVISIBLE);
        textBurgerPrice.setVisibility(View.INVISIBLE);

        imageFries.setVisibility(View.INVISIBLE);
        textFriesQuantity.setVisibility(View.INVISIBLE);
        btnBuyFries.setVisibility(View.INVISIBLE);
        btnRemFries.setVisibility(View.INVISIBLE);
        textFriesPrice.setVisibility(View.INVISIBLE);

        imageSoda.setVisibility(View.INVISIBLE);
        textSodaQuantity.setVisibility(View.INVISIBLE);
        btnBuySoda.setVisibility(View.INVISIBLE);
        btnRemSoda.setVisibility(View.INVISIBLE);
        textSodaPrice.setVisibility(View.INVISIBLE);

        editName.setVisibility(View.INVISIBLE);
        btnCart.setVisibility(View.INVISIBLE);
    }


}

package com.santiago.javius.store;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    ImageView imageBurger;
    ImageView imageFries;
    ImageView imageSoda;

    Button btnCart;
    Button btnBurger;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageBurger = findViewById(R.id.imageBurger);
        imageFries = findViewById(R.id.imageFries);
        imageSoda = findViewById(R.id.imageSoda);
        btnBurger = findViewById(R.id.btnBurger);
        //btnCart = findViewById(R.id.btnCart);
    }
    public void btnBurgerClicked(View view)
    {
        Toast.makeText(MainActivity.this, "1 Burger Added To Cart", Toast.LENGTH_LONG).show();
    }
    public void btnBurgerClicked(View view)
    {
        Toast.makeText(MainActivity.this, "1 Burger Added To Cart", Toast.LENGTH_LONG).show();
    }
    public void btnBurgerClicked(View view)
    {
        Toast.makeText(MainActivity.this, "1 Burger Added To Cart", Toast.LENGTH_LONG).show();
    }

}

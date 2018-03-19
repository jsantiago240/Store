package com.santiago.javius.store;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    ImageView imageBurger;
    ImageView imageFries;
    ImageView imageSoda;

    Button btnCart;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_second);
        imageBurger = findViewById(R.id.imageBurger);
        imageFries = findViewById(R.id.imageFries);
        imageSoda = findViewById(R.id.imageSoda);
        btnCart = findViewById(R.id.btnCart);
    }
    public void btnCartClicked(View view)
    {
        setContentView(ticTacToeBoardView);                                     //sets view to tictactoeboardview
    }
}

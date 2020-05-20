package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Ask_Button;
        Ask_Button = (Button) findViewById(R.id.Ask_button);
        final ImageView choice = (ImageView) findViewById(R.id.choice_image);
        final int[] Askarray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5

        };
        Ask_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomnumbergenerator = new Random();
                int number = randomnumbergenerator.nextInt(4);
                choice.setImageResource(Askarray[number]);
            }
        });

    }
}

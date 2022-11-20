package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;

public class GameStart_02 extends BaseActivity {

    Unit a_1, a_2, a_3, a_4;
    Unit b_1, b_2, b_3, b_4;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start02);

        a_1 = findViewById(R.id.A_1);
        a_2 = findViewById(R.id.A_2);
        a_3 = findViewById(R.id.A_3);
        a_4 = findViewById(R.id.A_4);
        b_1 = findViewById(R.id.B_1);
        b_2 = findViewById(R.id.B_2);
        b_3 = findViewById(R.id.B_3);
        b_4 = findViewById(R.id.B_4);

        a_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    a_1.setImageResource(R.drawable.unit_a_1);
                    a_2.setImageResource(R.drawable.unit_a_1);
                }
                else{
                    a_1.setImageResource(R.drawable.unit_b_1);
                    a_2.setImageResource(R.drawable.unit_b_1);
                }
            }
        });

        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    b_1.setImageResource(R.drawable.unit_a_1);
                    b_2.setImageResource(R.drawable.unit_a_1);
                    b_3.setImageResource(R.drawable.unit_a_1);
                }
                else{
                    b_1.setImageResource(R.drawable.unit_b_1);
                    b_2.setImageResource(R.drawable.unit_b_1);
                    b_3.setImageResource(R.drawable.unit_b_1);
                }
            }
        });
    }
}
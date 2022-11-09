package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Rule_02 extends BaseActivity {

    private ImageButton btn1;
    private ImageButton btn2;
    private ImageButton x_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rule_02);

        btn1 = (ImageButton)findViewById(R.id.goRule2_1);
        btn2 = (ImageButton)findViewById(R.id.goRule2_2);
        x_button = findViewById(R.id.x_button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rule_02.this, Rule_01.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rule_02.this, Rule_03.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        x_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rule_02.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }
}
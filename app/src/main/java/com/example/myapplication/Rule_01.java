package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Rule_01 extends BaseActivity {

    private ImageButton btn1;
    private ImageButton x_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rule_01);

        btn1 = (ImageButton)findViewById(R.id.goRule1);
        x_button = findViewById(R.id.x_button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rule_01.this, Rule_02.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        x_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rule_01.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }
}
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    private TextView nickName;
    private TextView point;

    private String nickNameString;
    private String pointString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.num1);
        button2 = findViewById(R.id.num2);
        button3 = findViewById(R.id.num3);
        button4 = findViewById(R.id.num4);

//        Intent intent = getIntent();
//        nickNameString = intent.getStringExtra("nickName");
//        nickName = findViewById(R.id.main_myName);
//        nickName.setText(nickNameString);
//
//        pointString = intent.getStringExtra("point");
//        point = findViewById(R.id.main_myPoint);
//        point.setText(pointString);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GameStart_01.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyFriend_01.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, Rule_01.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Setting_01.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

    }


}
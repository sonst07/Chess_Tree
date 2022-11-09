package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameStart_01<button> extends BaseActivity {

    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start01);

        btn1 = findViewById(R.id.gs1);
        btn2 = findViewById(R.id.gs2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameStart_01.this, GameStart_02.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameStart_01.this, GameStart_02.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Setting_01 extends BaseActivity {

    private Button bts1;
    private Button bts2;
    private Button bts3;
    private Button bts4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting01);
        FirebaseAuth mFirebaseAuth;
        mFirebaseAuth = FirebaseAuth.getInstance();

        bts1 = findViewById(R.id.st1);
        bts2 = findViewById(R.id.st2);
        bts3 = findViewById(R.id.st3);
        bts4 = findViewById(R.id.st4);

        bts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Setting_01.this, Profile.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        bts2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirebaseAuth.signOut();
                Toast.makeText(Setting_01.this, "로그아웃하였습니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Setting_01.this, LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finishAffinity();

            }
        });

        bts3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirebaseAuth.getCurrentUser().delete();
                Toast.makeText(Setting_01.this, "계절탈퇴되었습니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Setting_01.this, goodbyeActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finishAffinity();
            }
        });

        bts4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}
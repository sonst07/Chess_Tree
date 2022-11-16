package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int num = (int)(Math.random()*4);
        switch (num){
            case 0: setContentView(R.layout.activity_intro); break;
            case 1: setContentView(R.layout.activity_intro1); break;
            case 2: setContentView(R.layout.activity_intro2); break;
            case 3: setContentView(R.layout.activity_intro3); break;
        }
        startLoading();
        num = (int) (Math.random()*3);
    }

    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        }, 1200); // 화면에 Logo 2초간 보이기
    }
}
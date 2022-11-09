package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    private long backBtnTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    public void onBackPressed(){

        String currentActivityName = getClass().getSimpleName().trim();

        long curTime = System.currentTimeMillis(); //현재시간
        long gapTime = curTime - backBtnTime;

        if(currentActivityName.equals("MainActivity")&&(0 <= gapTime && 2000 >= gapTime)){ //2초안에 한번 더 누르게 되면 종료
            moveTaskToBack(true);
            finishAndRemoveTask();
            ActivityCompat.finishAffinity(this);
            android.os.Process.killProcess(android.os.Process.myPid());
        }else if(currentActivityName.equals("MainActivity")){
            backBtnTime = curTime;
            Toast.makeText(this, "두번 눌러 종료해주세요.", Toast.LENGTH_SHORT).show();
        }

//        String currentActivityName = getClass().getSimpleName().trim();
        if(currentActivityName.equals("MainActivity")) {
            return;
        }


        super.onBackPressed();
        overridePendingTransition(0, 0);
        finish();   //현재 액티비티 종료
    }
}
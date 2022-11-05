package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Rule_01 extends AppCompatActivity {

    ImageView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule01);
        RuleRRR_01 ruleRRR_01 = new RuleRRR_01();
        RuleRRR_02 ruleRRR_02 = new RuleRRR_02();
        RuleRRR_03 ruleRRR_03 = new RuleRRR_03();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, ruleRRR_01);
        transaction.commit();

        btn = findViewById(R.id.gogogo);

        String str = String.valueOf(getSupportFragmentManager().getFragments().get(0));

        System.out.println(str);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame, ruleRRR_02);
                transaction.commit();
            }
        });



    }
}
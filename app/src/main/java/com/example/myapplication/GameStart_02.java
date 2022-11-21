package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Iterator;

public class GameStart_02 extends BaseActivity {

    Unit a_1, a_2, a_3, a_4, a_a, a_b;
    Unit b_1, b_2, b_3, b_4, b_a, b_b;


    ArrayList<Unit> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start02);

        a_1 = findViewById(R.id.A_1);
        a_2 = findViewById(R.id.A_2);
        a_3 = findViewById(R.id.A_3);
        a_4 = findViewById(R.id.A_4);
        a_a = findViewById(R.id.A_a);
        a_b = findViewById(R.id.A_b);

        b_1 = findViewById(R.id.B_1);
        b_2 = findViewById(R.id.B_2);
        b_3 = findViewById(R.id.B_3);
        b_4 = findViewById(R.id.B_4);
        b_a = findViewById(R.id.B_a);
        b_b = findViewById(R.id.B_b);

        list.add(a_1); list.add(a_2); list.add(a_3);
        list.add(a_a); list.add(a_4); list.add(a_b);
        list.add(b_1); list.add(b_2); list.add(b_3);
        list.add(b_a); list.add(b_4); list.add(b_b);

        a_1.now = 1; a_2.now = 2; a_3.now = 3;
        a_a.now = 11; a_4.now = 12; a_b.now = 13;
        b_a.now = 21; b_4.now = 22; b_b.now = 23;
        b_3.now = 31; b_2.now = 32; b_1.now = 33;


        a_1.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    for(int k = 0; k < list.size(); k++){
                        if((a_1.now - list.get(k).now == -11) || (a_1.now - list.get(k).now == -9)
                                || (a_1.now - list.get(k).now == 11) ||  (a_1.now - list.get(k).now == 9))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0);}
                        }
                    }
                }
                else{
                    for(int k = 0; k < list.size(); k++){
                        if((a_1.now - list.get(k).now == -11) || (a_1.now - list.get(k).now == -9)
                                || (a_1.now - list.get(k).now == 11) ||  (a_1.now - list.get(k).now == 9))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1_change);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2_change);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3_change);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4_change);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0_change);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1_change);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2_change);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3_change);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4_change);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0_change);}
                        }
                    }
                }

            }
        });

        b_1.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    for(int k = 0; k < list.size(); k++){
                        if((b_1.now - list.get(k).now == -11) || (b_1.now - list.get(k).now == -9)
                                || (b_1.now - list.get(k).now == 11) ||  (b_1.now - list.get(k).now == 9))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0);}
                        }
                    }
                }
                else{
                    for(int k = 0; k < list.size(); k++){
                        if((b_1.now - list.get(k).now == -11) || (b_1.now - list.get(k).now == -9)
                                || (b_1.now - list.get(k).now == 11) ||  (b_1.now - list.get(k).now == 9))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1_change);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2_change);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3_change);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4_change);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0_change);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1_change);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2_change);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3_change);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4_change);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0_change);}
                        }
                    }
                }

            }
        });

        a_2.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    for(int k = 0; k < list.size(); k++){
                        if((a_2.now - list.get(k).now == 1) || (a_2.now - list.get(k).now == -1)
                            || (a_2.now - list.get(k).now == 10) ||  (a_2.now - list.get(k).now == -10)
                            || (a_2.now - list.get(k).now == -11) || (a_2.now - list.get(k).now == -9)
                                || (a_2.now - list.get(k).now == 11) ||  (a_2.now - list.get(k).now == 9))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0);}
                        }
                    }
                }else{
                    for(int k = 0; k < list.size(); k++){
                        if((a_2.now - list.get(k).now == 1) || (a_2.now - list.get(k).now == -1)
                                || (a_2.now - list.get(k).now == 10) ||  (a_2.now - list.get(k).now == -10)
                                || (a_2.now - list.get(k).now == -11) || (a_2.now - list.get(k).now == -9)
                                || (a_2.now - list.get(k).now == 11) ||  (a_2.now - list.get(k).now == 9))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1_change);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2_change);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3_change);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4_change);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0_change);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1_change);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2_change);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3_change);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4_change);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0_change);}
                        }
                    }
                }

            }
        });

        b_2.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    for(int k = 0; k < list.size(); k++){
                        if((b_2.now - list.get(k).now == 1) || (b_2.now - list.get(k).now == -1)
                                || (b_2.now - list.get(k).now == 10) ||  (b_2.now - list.get(k).now == -10)
                                || (b_2.now - list.get(k).now == -11) || (b_2.now - list.get(k).now == -9)
                                || (b_2.now - list.get(k).now == 11) ||  (b_2.now - list.get(k).now == 9))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0);}
                        }
                    }
                }else{
                    for(int k = 0; k < list.size(); k++){
                        if((b_2.now - list.get(k).now == 1) || (b_2.now - list.get(k).now == -1)
                                || (b_2.now - list.get(k).now == 10) ||  (b_2.now - list.get(k).now == -10)
                                || (b_2.now - list.get(k).now == -11) || (b_2.now - list.get(k).now == -9)
                                || (b_2.now - list.get(k).now == 11) ||  (b_2.now - list.get(k).now == 9))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1_change);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2_change);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3_change);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4_change);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0_change);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1_change);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2_change);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3_change);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4_change);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0_change);}
                        }
                    }
                }

            }
        });

        a_3.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    for(int k = 0; k < list.size(); k++){
                        if((a_3.now - list.get(k).now == 1) || (a_3.now - list.get(k).now == -1)
                                || (a_3.now - list.get(k).now == 10) ||  (a_3.now - list.get(k).now == -10))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0);}
                        }
                    }
                }else{
                    for(int k = 0; k < list.size(); k++){
                        if((a_3.now - list.get(k).now == 1) || (a_3.now - list.get(k).now == -1)
                                || (a_3.now - list.get(k).now == 10) ||  (a_3.now - list.get(k).now == -10))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1_change);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2_change);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3_change);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4_change);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0_change);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1_change);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2_change);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3_change);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4_change);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0_change);}
                        }
                    }
                }

            }
        });

        b_3.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    for(int k = 0; k < list.size(); k++){
                        if((b_3.now - list.get(k).now == 1) || (b_3.now - list.get(k).now == -1)
                                || (b_3.now - list.get(k).now == 10) ||  (b_3.now - list.get(k).now == -10))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0);}
                        }
                    }
                }else{
                    for(int k = 0; k < list.size(); k++){
                        if((b_3.now - list.get(k).now == 1) || (b_3.now - list.get(k).now == -1)
                                || (b_3.now - list.get(k).now == 10) ||  (b_3.now - list.get(k).now == -10))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1_change);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2_change);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3_change);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4_change);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0_change);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1_change);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2_change);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3_change);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4_change);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0_change);}
                        }
                    }
                }

            }
        });

        a_4.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    for(int k = 0; k < list.size(); k++){
                        if( (a_4.now - list.get(k).now == -10))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0);}
                        }
                    }
                }else{
                    for(int k = 0; k < list.size(); k++){
                        if( (a_4.now - list.get(k).now == -10))
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1_change);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2_change);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3_change);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4_change);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0_change);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1_change);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2_change);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3_change);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4_change);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0_change);}
                        }
                    }
                }

            }
        });

        b_4.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if ( i == 0 ){
                    for(int k = 0; k < list.size(); k++){
                        if( (b_4.now - list.get(k).now == 10) )
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0);}
                        }
                    }
                }else{
                    for(int k = 0; k < list.size(); k++){
                        if( (b_4.now - list.get(k).now == 10) )
                        {
                            if(list.get((k)) == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1_change);}
                            else if(list.get((k)) == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2_change);}
                            else if(list.get((k)) == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3_change);}
                            else if(list.get((k)) == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4_change);}
                            else if(list.get((k)) == a_a) {a_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == a_b) {a_b.setBackgroundResource(R.drawable.unit_0_change);}

                            else if(list.get((k)) == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1_change);}
                            else if(list.get((k)) == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2_change);}
                            else if(list.get((k)) == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3_change);}
                            else if(list.get((k)) == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4_change);}
                            else if(list.get((k)) == b_a) {b_a.setBackgroundResource(R.drawable.unit_0_change);}
                            else if(list.get((k)) == b_b) {b_b.setBackgroundResource(R.drawable.unit_0_change);}
                        }
                    }
                }

            }
        });




    }
}
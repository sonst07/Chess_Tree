package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.Iterator;

public class GameStart_02 extends BaseActivity {

    Unit lastClickView;
    Unit a_1, a_2, a_3, a_4, a_a, a_b;
    Unit b_1, b_2, b_3, b_4, b_a, b_b;
    boolean a_1_touched, a_2_touched, a_3_touched, a_4_touched;
    boolean b_1_touched, b_2_touched, b_3_touched, b_4_touched;

    ArrayList<Unit> list = new ArrayList<>();
    ArrayList<Unit> alist = new ArrayList<>();
    ArrayList<Unit> blist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start02);

        a_1 = findViewById(R.id.A_1); a_2 = findViewById(R.id.A_2); a_3 = findViewById(R.id.A_3);
        a_4 = findViewById(R.id.A_4); a_a = findViewById(R.id.A_a); a_b = findViewById(R.id.A_b);

        b_1 = findViewById(R.id.B_1); b_2 = findViewById(R.id.B_2); b_3 = findViewById(R.id.B_3);
        b_4 = findViewById(R.id.B_4); b_a = findViewById(R.id.B_a); b_b = findViewById(R.id.B_b);

        list.add(a_1); list.add(a_2); list.add(a_3);
        list.add(a_a); list.add(a_4); list.add(a_b);
        list.add(b_1); list.add(b_2); list.add(b_3);
        list.add(b_a); list.add(b_4); list.add(b_b);

        alist.add(a_1); alist.add(a_2); alist.add(a_3); alist.add(a_4);
        blist.add(b_1); blist.add(b_2); blist.add(b_3); blist.add(b_4);

        a_1.now = 1; a_2.now = 2; a_3.now = 3;
        a_a.now = 11; a_4.now = 12; a_b.now = 13;
        b_a.now = 21; b_4.now = 22; b_b.now = 23;
        b_3.now = 31; b_2.now = 32; b_1.now = 33;


        a_1.setOnClickListener(new View.OnClickListener() {
            Unit ChangerUnit = a_1;
            @Override
            public void onClick(View v) {

                if(lastClickView == a_2){
//                    a_1.setBackgroundResource(R.drawable.unit_a_2);
//                    a_2.setBackgroundResource(R.drawable.unit_a_1);

                    Unit temp = a_1;
                    a_1 = a_2;
                    a_2 = temp;

                    BackgroundChanger(a_2, false);
                    lastClickView = null;
                    a_2_touched = false;
                    a_1_touched = false;
                    return;
                }else if(lastClickView == a_4){
//                    a_4.setBackgroundResource(R.drawable.unit_a_1);
//                    a_1.setBackgroundResource(R.drawable.unit_a_4);

                    Unit temp = a_4;
                    a_4 = a_1;
                    a_1 = temp;

                    BackgroundChanger(a_4, false);
                    lastClickView =null;
                    a_1_touched = false;
                    a_4_touched = false;
                    return;
                }else if(lastClickView == a_3){
//                    a_1.setBackgroundResource(R.drawable.unit_a_3);
//                    a_3.setBackgroundResource(R.drawable.unit_a_1);

                    Unit temp = a_1;
                    a_1 = a_3;
                    a_3 = temp;

                    BackgroundChanger(a_3, false);
                    lastClickView =null;
                    a_1_touched = false;
                    a_3_touched = false;
                    return;
                }




                a_1_touched = !a_1_touched;
                BackgroundChanger(ChangerUnit, a_1_touched);

                lastClickView = a_1;
            }
        });

        a_2.setOnClickListener(new View.OnClickListener() {
            Unit ChangerUnit = a_2;
            @Override
            public void onClick(View v) {

                if(lastClickView == a_3 ){ //&& a_3.selected ??? 이 문제를 어떻게 처리할까?
//                    a_3.setBackgroundResource(R.drawable.unit_a_2);
//                    a_2.setBackgroundResource(R.drawable.unit_a_3);

                    Unit temp = a_3;
                    a_3 = a_2;
                    a_2 = temp;

                    BackgroundChanger(a_3, false);
                    lastClickView =null;
                    a_2_touched = false;
                    a_3_touched = false;
                    return;}
                else if(lastClickView == a_4){
//                    a_4.setBackgroundResource(R.drawable.unit_a_2);
//                    a_2.setBackgroundResource(R.drawable.unit_a_4);

                    Unit temp = a_4;
                    a_4 = a_2;
                    a_2 = temp;

                    BackgroundChanger(a_4, false);
                    lastClickView =null;
                    a_2_touched = false;
                    a_4_touched = false;
                    return;
                }else if(lastClickView == a_1 ){
//                    a_1.setBackgroundResource(R.drawable.unit_a_2);
//                    a_2.setBackgroundResource(R.drawable.unit_a_1);

                    Unit temp = a_1;
                    a_1 = a_2;
                    a_2 = temp;

                    BackgroundChanger(a_1, false);
                    lastClickView =null;
                    a_2_touched = false;
                    a_1_touched = false;
                    return;
                }






                a_2_touched = !a_2_touched;
                BackgroundChanger(ChangerUnit, a_2_touched);

                lastClickView = a_2;

            }
        });

        a_3.setOnClickListener(new View.OnClickListener() {
            Unit ChangerUnit = a_3;

            @Override
            public void onClick(View v) {
                if(lastClickView == a_2){ // && a_2.selected
//                    a_3.setBackgroundResource(R.drawable.unit_a_2);
//                    a_2.setBackgroundResource(R.drawable.unit_a_3);

                    Unit temp = a_3;
                    a_3 = a_2;
                    a_2 = temp;

                    BackgroundChanger(a_2, false);
                    lastClickView = null;
                    a_2_touched = false;
                    a_3_touched = false;
                    return;}
                 else if(lastClickView == a_4 ){
//                    a_4.setBackgroundResource(R.drawable.unit_a_3);
//                    a_3.setBackgroundResource(R.drawable.unit_a_4);

                    Unit temp = a_4;
                    a_4 = a_3;
                    a_3 = temp;

                    BackgroundChanger(a_4, false);
                    lastClickView =null;
                    a_4_touched = false;
                    a_3_touched = false;
                    return;
                }else if(lastClickView == a_1){
//                    a_1.setBackgroundResource(R.drawable.unit_a_3);
//                    a_3.setBackgroundResource(R.drawable.unit_a_1);

                    Unit temp = a_1;
                    a_1 = a_3;
                    a_3 = temp;

                    BackgroundChanger(a_1, false);
                    lastClickView =null;
                    a_1_touched = false;
                    a_3_touched = false;
                    return;
                }





                a_3_touched = !a_3_touched;
                BackgroundChanger(ChangerUnit, a_3_touched);

                lastClickView = a_3;

            }
        });


        a_4.setOnClickListener(new View.OnClickListener() {
            Unit ChangerUnit = a_4;
            @Override
            public void onClick(View v) {

                if(lastClickView == a_2){
//                    a_4.setBackgroundResource(R.drawable.unit_a_2);
//                    a_2.setBackgroundResource(R.drawable.unit_a_4);

                    Unit temp = a_4;
                    a_4 = a_2;
                    a_2 = temp;

                    BackgroundChanger(a_2, false);
                    lastClickView = null;
                    a_2_touched = false;
                    a_4_touched = false;
                    return;
                }else if(lastClickView == a_3){
//                    a_4.setBackgroundResource(R.drawable.unit_a_3);
//                    a_3.setBackgroundResource(R.drawable.unit_a_4);

                    Unit temp = a_4;
                    a_4 = a_3;
                    a_3 = temp;

                    BackgroundChanger(a_3, false);
                    lastClickView =null;
                    a_4_touched = false;
                    a_3_touched = false;
                    return;
                }else if(lastClickView == a_1){
//                    a_1.setBackgroundResource(R.drawable.unit_a_4);
//                    a_4.setBackgroundResource(R.drawable.unit_a_1);

                    Unit temp = a_1;
                    a_1 = a_4;
                    a_4 = temp;

                    BackgroundChanger(a_1, false);
                    lastClickView =null;
                    a_1_touched = false;
                    a_4_touched = false;
                    return;
                }




                a_4_touched = !a_4_touched;
                BackgroundChanger(ChangerUnit, a_4_touched);

                lastClickView = a_4;
            }
        });

        b_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                b_1_touched = !b_1_touched;
                BackgroundChanger(b_1, b_1_touched);

                lastClickView = b_1;
            }
        });


        b_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                b_2_touched = !b_2_touched;
                BackgroundChanger(b_2, b_2_touched);

                lastClickView = b_2;

            }
        });


        b_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                b_3_touched = !b_3_touched;
                BackgroundChanger(b_3, b_3_touched);

                lastClickView = b_3;
            }
        });

        b_4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                b_4_touched = !b_4_touched;

                BackgroundChanger(b_4, b_4_touched);

                lastClickView = b_4;
            }
        });


    }

    public void BackgroundChanger_1(Unit unit){
        // 모든 유닛 터치 원상복구
        for(int j = 0; j < list.size(); j++){
            if(list.get(j) != unit){
                list.get(j).setClickable(true);
                list.get(j).selected = false;
            }
        }

        if(unit == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1);}
        else if(unit == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2);}
        else if(unit == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3);}
        else if(unit == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4);}
        else if(unit == a_a) {a_a.setBackgroundResource(R.drawable.unit_0);}
        else if(unit == a_b) {a_b.setBackgroundResource(R.drawable.unit_0);}

        else if(unit == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1);}
        else if(unit == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2);}
        else if(unit == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3);}
        else if(unit == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4);}
        else if(unit == b_a) {b_a.setBackgroundResource(R.drawable.unit_0);}
        else if(unit == b_b) {b_b.setBackgroundResource(R.drawable.unit_0);}
    }

    public void BackgroundChanger_2(Unit unit){
        // 한 유닛 터치 원상복구
        unit.setClickable(true);
        unit.selected = true;

        if(unit == a_1) {a_1.setBackgroundResource(R.drawable.unit_a_1_change);}
        else if(unit == a_2) {a_2.setBackgroundResource(R.drawable.unit_a_2_change);}
        else if(unit == a_3) {a_3.setBackgroundResource(R.drawable.unit_a_3_change);}
        else if(unit == a_4) {a_4.setBackgroundResource(R.drawable.unit_a_4_change);}
        else if(unit == a_a) {a_a.setBackgroundResource(R.drawable.unit_0_change);}
        else if(unit == a_b) {a_b.setBackgroundResource(R.drawable.unit_0_change);}

        else if(unit == b_1) {b_1.setBackgroundResource(R.drawable.unit_b_1_change);}
        else if(unit == b_2) {b_2.setBackgroundResource(R.drawable.unit_b_2_change);}
        else if(unit == b_3) {b_3.setBackgroundResource(R.drawable.unit_b_3_change);}
        else if(unit == b_4) {b_4.setBackgroundResource(R.drawable.unit_b_4_change);}
        else if(unit == b_a) {b_a.setBackgroundResource(R.drawable.unit_0_change);}
        else if(unit == b_b) {b_b.setBackgroundResource(R.drawable.unit_0_change);}
    }

    //자신제외 모든터치 막기
    public void clickBlock(Unit unit){
        for(int j = 0; j < list.size(); j++){
            if(list.get(j) != unit){
                list.get(j).setClickable(false);
            }
        }
    }

    public void BackgroundChanger(Unit unit, boolean backBool){

        a_1.setBackgroundResource(R.drawable.unit_a_1);
        a_2.setBackgroundResource(R.drawable.unit_a_2);
        a_3.setBackgroundResource(R.drawable.unit_a_3);
        a_4.setBackgroundResource(R.drawable.unit_a_4);
        a_a.setBackgroundResource(R.drawable.unit_0);
        a_b.setBackgroundResource(R.drawable.unit_0);

        b_1.setBackgroundResource(R.drawable.unit_b_1);
        b_2.setBackgroundResource(R.drawable.unit_b_2);
        b_3.setBackgroundResource(R.drawable.unit_b_3);
        b_4.setBackgroundResource(R.drawable.unit_b_4);
        b_a.setBackgroundResource(R.drawable.unit_0);
        b_b.setBackgroundResource(R.drawable.unit_0);



        if((unit == a_1) || (unit == b_1)){
            if (!backBool){
                for(int k = 0; k < list.size(); k++){
                    if((unit.now - list.get(k).now == -11) || (unit.now - list.get(k).now == -9)
                            || (unit.now - list.get(k).now == 11) ||  (unit.now - list.get(k).now == 9))
                    {
                        // 터치 원상복구
                        BackgroundChanger_1(list.get(k));
                    }
                }
            }
            else{
                // 먼저 자기빼고 터치을 막고
                clickBlock(unit);

                for(int k = 0; k < list.size(); k++){
                    if((unit.now - list.get(k).now == -11) || (unit.now - list.get(k).now == -9)
                            || (unit.now - list.get(k).now == 11) ||  (unit.now - list.get(k).now == 9))
                    {   // 색깔 칠해지는 얘들만 터치가능하게하기
                        BackgroundChanger_2(list.get(k));

                    }
                }
            }
        }

        else if((unit == a_2) || (unit == b_2)){
            if (!backBool){
                for(int k = 0; k < list.size(); k++){
                    if((unit.now - list.get(k).now == 1) || (unit.now - list.get(k).now == -1)
                            || (unit.now - list.get(k).now == 10) ||  (unit.now - list.get(k).now == -10)
                            || (unit.now - list.get(k).now == -11) || (unit.now - list.get(k).now == -9)
                            || (unit.now - list.get(k).now == 11) ||  (unit.now - list.get(k).now == 9))
                    { BackgroundChanger_1(list.get(k)); }
                }
            }
            else{
                clickBlock(unit);

                for(int k = 0; k < list.size(); k++){
                    if((unit.now - list.get(k).now == 1) || (unit.now - list.get(k).now == -1)
                            || (unit.now - list.get(k).now == 10) ||  (unit.now - list.get(k).now == -10)
                            || (unit.now - list.get(k).now == -11) || (unit.now - list.get(k).now == -9)
                            || (unit.now - list.get(k).now == 11) ||  (unit.now - list.get(k).now == 9))
                    { BackgroundChanger_2(list.get(k)); }
                }

            }
        }

        else if((unit == a_3) || (unit == b_3)){
            if (!backBool){
                for(int k = 0; k < list.size(); k++){
                    if((unit.now - list.get(k).now == 1) || (unit.now - list.get(k).now == -1)
                            || (unit.now - list.get(k).now == 10) ||  (unit.now - list.get(k).now == -10))
                    { BackgroundChanger_1(list.get(k)); }
                }
            }else{
                clickBlock(unit);

                for(int k = 0; k < list.size(); k++){
                    if((unit.now - list.get(k).now == 1) || (unit.now - list.get(k).now == -1)
                            || (unit.now - list.get(k).now == 10) ||  (unit.now - list.get(k).now == -10))
                    { BackgroundChanger_2(list.get(k)); }
                }
            }
        }


        else if(unit == a_4){
            if (!backBool ){
                for(int k = 0; k < list.size(); k++){
                    if( (unit.now - list.get(k).now == -10) )
                    { BackgroundChanger_1(list.get(k)); }
                }
            }else{
                clickBlock(unit);

                for(int k = 0; k < list.size(); k++){
                    if( (unit.now - list.get(k).now == -10) )
                    { BackgroundChanger_2(list.get(k)); }
                }
            }
        }

        else if(unit == b_4){
            if (!backBool){
                for(int k = 0; k < list.size(); k++){
                    if( (unit.now - list.get(k).now == 10) )
                    { BackgroundChanger_1(list.get(k)); }
                }
            }else{
                clickBlock(unit);

                for(int k = 0; k < list.size(); k++){
                    if( (unit.now - list.get(k).now == 10) )
                    { BackgroundChanger_2(list.get(k)); }
                }
            }
        }
    }
}
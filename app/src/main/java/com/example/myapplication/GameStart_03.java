package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class GameStart_03 extends BaseActivity {

    String lastClick;

    Unit u01, u02, u03;
    Unit u11, u12, u13;
    Unit u21, u22, u23;
    Unit u31, u32, u33;

    ArrayList<Unit> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start03);

        u01 = findViewById(R.id.A_1); u02 = findViewById(R.id.A_2); u03 = findViewById(R.id.A_3);
        u11 = findViewById(R.id.A_a); u12 = findViewById(R.id.A_4); u13 = findViewById(R.id.A_b);

        u21 = findViewById(R.id.B_a); u22 = findViewById(R.id.B_4); u23 = findViewById(R.id.B_b);
        u31 = findViewById(R.id.B_3); u32 = findViewById(R.id.B_2); u33 = findViewById(R.id.B_1);

        list.add(u01); list.add(u02); list.add(u03);
        list.add(u11); list.add(u12); list.add(u13);
        list.add(u21); list.add(u22); list.add(u23);
        list.add(u31); list.add(u32); list.add(u33);

        u01.setBackgroundResource(R.drawable.unit_a_1);
        u02.setBackgroundResource(R.drawable.unit_a_2);
        u03.setBackgroundResource(R.drawable.unit_a_3);
        u11.setBackgroundResource(R.drawable.unit_0);
        u12.setBackgroundResource(R.drawable.unit_a_4);
        u13.setBackgroundResource(R.drawable.unit_0);

        u21.setBackgroundResource(R.drawable.unit_0);
        u22.setBackgroundResource(R.drawable.unit_b_4);
        u23.setBackgroundResource(R.drawable.unit_0);
        u31.setBackgroundResource(R.drawable.unit_b_3);
        u32.setBackgroundResource(R.drawable.unit_b_2);
        u33.setBackgroundResource(R.drawable.unit_b_1);

        u01.now = 1; u02.now = 2; u03.now = 3;
        u11.now = 11; u12.now = 12; u13.now = 13;
        u21.now = 21; u22.now = 22; u23.now = 23;
        u31.now = 31; u32.now = 32; u33.now = 33;

        u01.what = "a_1"; u02.what = "a_2"; u03.what = "a_3";
        u11.what = "a_0"; u12.what = "a_4"; u13.what = "a_0";
        u21.what = "b_0"; u22.what = "b_4"; u23.what = "b_0";
        u31.what = "b_3"; u32.what = "b_2"; u33.what = "b_1";


        init();

    }

    public void init(){

        u01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u01.what;
                        u01.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u01);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u01.touched = false;
                        return;
                    }
                }


                u01.touched = !u01.touched;
                BackgroundChanger(u01);
                lastClick = u01.what;
            }
        });

        u02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u02.what;
                        u02.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u02);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u02.touched = false;
                        return;
                    }
                }


                u02.touched = !u02.touched;
                BackgroundChanger(u02);
                lastClick = u02.what;
            }
        });

        u03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u03.what;
                        u03.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u03);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u03.touched = false;
                        return;
                    }
                }


                u03.touched = !u03.touched;
                BackgroundChanger(u03);
                lastClick = u03.what;
            }
        });

        u11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u11.what;
                        u11.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u11);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u11.touched = false;
                        return;
                    }
                }


                u11.touched = !u11.touched;
                BackgroundChanger(u11);
                lastClick = u11.what;
            }
        });

        u12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u12.what;
                        u12.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u12);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u12.touched = false;
                        return;
                    }
                }


                u12.touched = !u12.touched;
                BackgroundChanger(u12);
                lastClick = u12.what;
            }
        });

        u13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u13.what;
                        u13.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u13);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u13.touched = false;
                        return;
                    }
                }


                u13.touched = !u13.touched;
                BackgroundChanger(u13);
                lastClick = u13.what;
            }
        });

        u21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u21.what;
                        u21.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u21);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u21.touched = false;
                        return;
                    }
                }


                u21.touched = !u21.touched;
                BackgroundChanger(u21);
                lastClick = u21.what;
            }
        });

        u22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u22.what;
                        u22.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u22);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u22.touched = false;
                        return;
                    }
                }

                u22.touched = !u22.touched;
                BackgroundChanger(u22);
                lastClick = u22.what;
            }
        });

        u23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u23.what;
                        u23.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u23);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u23.touched = false;
                        return;
                    }
                }


                u23.touched = !u23.touched;
                BackgroundChanger(u23);
                lastClick = u23.what;
            }
        });


        u31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u31.what;
                        u31.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u31);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u31.touched = false;
                        return;
                    }
                }

                u31.touched = !u31.touched;
                BackgroundChanger(u31);
                lastClick = u31.what;
            }
        });

        u32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u32.what;
                        u32.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u32);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u32.touched = false;
                        return;
                    }
                }

                u32.touched = !u32.touched;
                BackgroundChanger(u32);
                lastClick = u32.what;
            }
        });

        u33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i = 0 ; i < list.size(); i++){
                    if(list.get(i).what == lastClick){
                        list.get(i).touched = false;
                        BackgroundChanger(list.get(i));

                        String temp = u33.what;
                        u33.what = list.get(i).what;
                        list.get(i).what = temp;

                        BackgroundChanger_1(u33);
                        BackgroundChanger_1(list.get(i));

                        lastClick = null;
                        list.get(i).touched = false;
                        u33.touched = false;
                        return;
                    }
                }

                u33.touched = !u33.touched;
                BackgroundChanger(u33);
                lastClick = u33.what;
            }
        });
    }

    public void clickBlock(Unit unit){
        for(int j = 0; j < list.size(); j++){
            if(list.get(j) != unit){
                list.get(j).setClickable(false);
            }
        }
    }

    public void BackgroundChanger_1(Unit unit){
        // 모든 유닛 터치 원상복구
        for(int j = 0; j < list.size(); j++){
            if(list.get(j) != unit){
                list.get(j).setClickable(true);
                list.get(j).selected = false;
            }
        }

        if(unit.what == "a_1") {unit.setBackgroundResource(R.drawable.unit_a_1);}
        else if(unit.what == "a_2") {unit.setBackgroundResource(R.drawable.unit_a_2);}
        else if(unit.what == "a_3") {unit.setBackgroundResource(R.drawable.unit_a_3);}
        else if(unit.what == "a_4") {unit.setBackgroundResource(R.drawable.unit_a_4);}
        else if(unit.what == "a_0") {unit.setBackgroundResource(R.drawable.unit_0);}

        else if(unit.what == "b_1") {unit.setBackgroundResource(R.drawable.unit_b_1);}
        else if(unit.what == "b_2") {unit.setBackgroundResource(R.drawable.unit_b_2);}
        else if(unit.what == "b_3") {unit.setBackgroundResource(R.drawable.unit_b_3);}
        else if(unit.what == "b_4") {unit.setBackgroundResource(R.drawable.unit_b_4);}
        else if(unit.what == "b_0") {unit.setBackgroundResource(R.drawable.unit_0);}
    }

    public void BackgroundChanger_2(Unit unit){
        // 한 유닛 터치 원상복구
        unit.setClickable(true);

        if(unit.what == "a_1") {unit.setBackgroundResource(R.drawable.unit_a_1_change);}
        else if(unit.what == "a_2") {unit.setBackgroundResource(R.drawable.unit_a_2_change);}
        else if(unit.what == "a_3") {unit.setBackgroundResource(R.drawable.unit_a_3_change);}
        else if(unit.what == "a_4") {unit.setBackgroundResource(R.drawable.unit_a_4_change);}
        else if(unit.what == "a_0") {unit.setBackgroundResource(R.drawable.unit_0_change);}

        else if(unit.what == "b_1") {unit.setBackgroundResource(R.drawable.unit_b_1_change);}
        else if(unit.what == "b_2") {unit.setBackgroundResource(R.drawable.unit_b_2_change);}
        else if(unit.what == "b_3") {unit.setBackgroundResource(R.drawable.unit_b_3_change);}
        else if(unit.what == "b_4") {unit.setBackgroundResource(R.drawable.unit_b_4_change);}
        else if(unit.what == "b_0") {unit.setBackgroundResource(R.drawable.unit_0_change);}
    }

    public void BackgroundChanger(Unit unit){

        if((unit.what == "a_1") || (unit.what == "b_1")){
            if (!unit.touched){
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

        else if((unit.what == "a_2") || (unit.what == "b_2")){
            if (!unit.touched){
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

        else if((unit.what == "a_3") || (unit.what == "b_3")){
            if (!unit.touched){
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


        else if(unit.what == "a_4"){
            if (!unit.touched ){
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

        else if(unit.what == "b_4"){
            if (!unit.touched){
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
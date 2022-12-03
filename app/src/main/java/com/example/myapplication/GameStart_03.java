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
    ArrayList<String> aList = new ArrayList<>();
    ArrayList<String> bList = new ArrayList<>();

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

        aList.add("a_1"); aList.add("a_2"); aList.add("a_3"); aList.add("a_4"); aList.add("a_0"); aList.add("b_0");
        bList.add("b_1"); bList.add("b_2"); bList.add("b_3"); bList.add("b_4"); bList.add("a_0"); bList.add("b_0");


        init();

    }

    public void init(){

        u01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u01);

            }
        });

        u02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u02);

            }
        });

        u03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u03);

            }
        });

        u11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u11);

            }
        });

        u12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u12);

            }
        });

        u13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u13);

            }
        });

        u21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u21);

            }
        });

        u22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u22);

            }
        });

        u23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u23);

            }
        });


        u31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u31);

            }
        });

        u32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u32);

            }
        });

        u33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                move(u33);

            }
        });
    }

    public void move(Unit unit){
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).what == lastClick){
                list.get(i).touched = false; // 터치시 원상복귀용
                BackgroundChanger(list.get(i));

                String temp = unit.what; // 서로 what 교환
                unit.what = list.get(i).what;
                list.get(i).what = temp;

                BackgroundChanger_1(unit); // 바뀐 그림 바꿔주기
                BackgroundChanger_1(list.get(i));

                lastClick = null;
                return;
            }
        }

        unit.touched = !unit.touched;
        BackgroundChanger(unit);
        lastClick = unit.what;




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
            list.get(j).setClickable(true);
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
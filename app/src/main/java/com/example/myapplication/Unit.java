package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class Unit extends androidx.appcompat.widget.AppCompatImageButton {

    public int now = 0; // 터치시 움질일 수 있는 칸 보이는 용
    public String what = null; // ***이게 핵심! 어떤 모양과 어디로 움직일수 있는지를 나타냄
    public boolean touched = false; // 터치가능한지
    public boolean check = true;

    public Unit(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }



}

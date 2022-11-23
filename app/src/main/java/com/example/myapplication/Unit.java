package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class Unit extends androidx.appcompat.widget.AppCompatImageButton {

    public int now = 0;
    public boolean selected = false;
    public Unit(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}

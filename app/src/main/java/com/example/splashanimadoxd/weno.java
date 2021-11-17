package com.example.splashanimadoxd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class weno extends AppCompatActivity {


    Animation ww,ss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weno);
        ww = AnimationUtils.loadAnimation(this,R.anim.animation);
        ss = AnimationUtils.loadAnimation(this,R.anim.animacion2);
    }
}
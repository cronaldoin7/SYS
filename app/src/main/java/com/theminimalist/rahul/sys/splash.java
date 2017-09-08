package com.theminimalist.rahul.sys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;

public class splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent go = new Intent(splash.this,Login.class);
                startActivity(go);



                finish();
            }
        }, SPLASH_TIME_OUT);
    }






}
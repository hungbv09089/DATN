package com.example.datn1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.datn1.R;
import com.example.datn1.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setMyColorStatusBar(R.color.bg_status_bar);
    }
}
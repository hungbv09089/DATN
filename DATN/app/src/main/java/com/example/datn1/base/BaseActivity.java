package com.example.datn1.base;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class BaseActivity extends AppCompatActivity {


    public void setMyColorStatusBar(int idColor){
        Window window =  getWindow();

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(ContextCompat.getColor(this,idColor));

    }
}

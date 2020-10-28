package com.thomas.core.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.thomas.core.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtils.showShort("hhhh");
    }
}
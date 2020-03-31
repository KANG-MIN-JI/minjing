package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class FiveActivity extends Activity {

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        CheckBox ch1 = (CheckBox) findViewById(R.id.ch1);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        setContentView(R.layout.third);
        CheckBox ch2 = (CheckBox) findViewById(R.id.ch2);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        setContentView(R.layout.third);
        CheckBox ch3 = (CheckBox) findViewById(R.id.ch3);
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        setContentView(R.layout.third);
        Button btnApply1 = (Button) findViewById(R.id.btnApply1);
        btnApply1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}

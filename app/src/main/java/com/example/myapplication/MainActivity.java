package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGeneral = (Button) findViewById(R.id.btnGeneral);
        btnGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        SecondActivity.class);
            }
        });
        setContentView(R.layout.activity_main);
        Button btnAnother = (Button) findViewById(R.id.btnAnother);
        btnAnother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
            }
        });
        setContentView(R.layout.second);
        TextView te1 = (TextView) findViewById(R.id.te1);
        te1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
            }
        });
        setContentView(R.layout.third);
        CheckBox ch1 = (CheckBox) findViewById(R.id.ch1);
        CheckBox ch2 = (CheckBox) findViewById(R.id.ch2);
        CheckBox ch3 = (CheckBox) findViewById(R.id.ch3);
        Button btnApply1 = (Button) findViewById(R.id.btnApply1);
        ch1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnApply1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

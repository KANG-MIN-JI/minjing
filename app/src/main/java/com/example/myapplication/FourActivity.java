package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView te1 = (TextView) findViewById(R.id.te1);
        te1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            }
        });

    }
}

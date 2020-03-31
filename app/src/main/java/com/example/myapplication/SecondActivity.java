package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Button btnGet = (Button) findViewById(R.id.btnGet);
        btnGet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();;
            }
        });
    }
}

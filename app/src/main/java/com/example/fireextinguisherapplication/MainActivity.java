package com.example.fireextinguisherapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button scanbtn,btni;
    public static TextView scantext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scantext=(TextView)findViewById(R.id.scantext);
        scanbtn= (Button) findViewById(R.id.scanbtn);
        btni= findViewById(R.id.btni);

        scanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this, ScanCodeActivity.class);
                startActivity(j);
                finish();
            }
        });

        btni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this, ScanCodeActivity.class);
                startActivity(j);
            }
        });
    }
}
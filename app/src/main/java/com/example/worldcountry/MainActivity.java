package com.example.worldcountry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button BangladeshButton, IndiaButton, PakistanButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BangladeshButton = findViewById(R.id.bangladeshId);
        IndiaButton = findViewById(R.id.indiaId);
        PakistanButton = findViewById(R.id.pakistanId);
        BangladeshButton.setOnClickListener(this);
        IndiaButton.setOnClickListener(this);
        PakistanButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bangladeshId){
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }
        if(view.getId()==R.id.indiaId){
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "indian");
            startActivity(intent);
        }
        if(view.getId()==R.id.pakistanId){
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "pakistan");
            startActivity(intent);
        }
    }
}
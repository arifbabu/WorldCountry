package com.example.worldcountry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView = findViewById(R.id.imageViewId);
        textView = findViewById(R.id.textViewId);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }
    }

    void showDetails(String countryName){
        if(countryName.equals("bangladesh")){
//            imageView.setImageResource(R.drawable.ic_launcher_background);
            textView.setText(R.string.bangladesh_text);
        }
        if(countryName.equals("india")){
//            imageView.setImageResource(R.drawable.ic_launcher_background);
            textView.setText(R.string.india_text);
        }
        if(countryName.equals("pakistan")){
//            imageView.setImageResource(R.drawable.ic_launcher_background);
            textView.setText(R.string.pakistan_text);
        }
    }
}
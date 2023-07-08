package com.example.favoriterecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Explanaition extends AppCompatActivity {
Button back;
        ImageView imageView;
        TextView text;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_explanaition);
            String des = (String) getIntent().getExtras().get("food");
            int image = (int) getIntent().getExtras().get("image");
            imageView = (ImageView) findViewById(R.id.logo);
            imageView.setImageResource(image);
            text = (TextView) findViewById(R.id.explanaition);
            text.setText(des);
            back = findViewById(R.id.Back);
            back.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (Explanaition.this,MainActivity.class);
                    startActivity(intent);
                }

            });
        }
    }
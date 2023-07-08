package com.example.favoriterecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class Recipies extends AppCompatActivity {
    ImageView imageView;
    ListView list;
    Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipies);
        imageView = (ImageView) findViewById(R.id.logo1);
        list = (ListView) findViewById(R.id.list_foods);
        int image = (int) getIntent().getExtras().get("image");
        imageView.setImageResource(image);
        String arr[] = (String[]) getIntent().getStringArrayExtra("food");
        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,arr);
        list.setAdapter(listAdapter);

        Back = findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Recipies.this,MainActivity.class);
                startActivity(intent);
            }

        });
    }
}
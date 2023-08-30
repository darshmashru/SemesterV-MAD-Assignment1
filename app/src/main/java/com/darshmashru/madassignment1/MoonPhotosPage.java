package com.darshmashru.madassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MoonPhotosPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon_photos_page);
    }
    public void goBack(View view){
        Intent goback = new Intent(MoonPhotosPage.this, MainActivity.class);
        startActivity(goback);
    }
}
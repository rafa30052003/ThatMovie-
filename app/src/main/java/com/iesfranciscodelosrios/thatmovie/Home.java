package com.iesfranciscodelosrios.thatmovie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        Intent intent = getIntent();


        if (intent != null && intent.hasExtra("USERNAME")) {
            String nombreUsuario = intent.getStringExtra("USERNAME");


            TextView textView = findViewById(R.id.textView8);
            textView.setText(nombreUsuario);
        }
    }
}

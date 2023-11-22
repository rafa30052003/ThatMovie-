package com.iesfranciscodelosrios.thatmovie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.editTextUsername);
        TextView password = findViewById(R.id.editTextPass);

        AppCompatButton loginBtn = findViewById(R.id.button);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario = username.getText().toString();
                String contraseña = password.getText().toString();

                if (nombreUsuario.equals("admin") && contraseña.equals("1234")) {
                    Toast.makeText(MainActivity.this, "Has iniciado sesión correctamente!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    intent.putExtra("USERNAME", nombreUsuario);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "El usuario no existe, intentelo de nuevo", Toast.LENGTH_SHORT).show();
                }
            }
        });

        TextView registerNowTextView = findViewById(R.id.textView4);
        registerNowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.u1tema2android_ejerciciospropuestos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ir_lista_canciones(View view) {
        startActivity(new Intent(this,ListaCanciones.class));
    }

    public void ir_login(View view) {
        startActivity(new Intent(this,Login.class));
    }
}

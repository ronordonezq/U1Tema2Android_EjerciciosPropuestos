package com.example.u1tema2android_ejerciciospropuestos.mirecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.u1tema2android_ejerciciospropuestos.R;

public class multimedia extends AppCompatActivity {

    MediaPlayer mp;
    TextView txtmensaje;
    String titulo;
    int posicion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);
        Bundle extras = getIntent().getExtras();
        titulo = extras.getString("nombre");
        txtmensaje=findViewById(R.id.txtcancion);
        txtmensaje.setText("Nombre : " + titulo);

    }

    public void destruir() {
        if(mp!=null)
            mp.release();
    }

    public void iniciar(View v){
        destruir();

        if(titulo.equals("Arcade Fire - Intervention.mp3")){
            mp = MediaPlayer.create(this, R.raw.intervention);
        }
        if(titulo.equals("Arcade Fire - Neighborhood.mp3")){
            mp = MediaPlayer.create(this, R.raw.neighborhood);
        }
        if(titulo.equals("Arcade Fire - No Cars Go.mp3")){
            mp = MediaPlayer.create(this, R.raw.nocarsgo);
        }
        if(titulo.equals("Arcade Fire - Ready to Start.mp3")){
            mp = MediaPlayer.create(this, R.raw.readytostart);
        }


        mp.start();
    }


    public void continuar(View v){
        if(mp !=null && mp.isPlaying() == false){
            mp.seekTo(posicion);
            mp.start();
        }
    }

    public void detener(View v){
        destruir();
    }

    public void pausar(View view) {
        if(mp!=null && mp.isPlaying()){
            posicion = mp.getCurrentPosition();
            mp.pause();
        }
    }
}

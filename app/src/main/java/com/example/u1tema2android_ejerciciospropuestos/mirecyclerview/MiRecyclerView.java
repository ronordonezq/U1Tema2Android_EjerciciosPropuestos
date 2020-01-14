package com.example.u1tema2android_ejerciciospropuestos.mirecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

import com.example.u1tema2android_ejerciciospropuestos.R;

import java.util.Vector;

public class MiRecyclerView extends AppCompatActivity implements InterfaceToast {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MiAdaptador adaptador;
    private Vector<String> misdatos;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_recycler_view);
        recyclerView = findViewById(R.id.recycler_view);
        misdatos = new Vector<String>();
        misdatos.add("Arcade Fire - Intervention.mp3");
        misdatos.add("Arcade Fire - Neighborhood.mp3");
        misdatos.add("Arcade Fire - No Cars Go.mp3");
        misdatos.add("Arcade Fire - Ready to Start.mp3");
        adaptador = new MiAdaptador(this,
                misdatos);
        recyclerView.setAdapter(adaptador);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void mensaje(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();

    }
}

package com.example.myapplication.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Adapter.DetalhesAdapter;
import com.example.myapplication.R;
import com.example.myapplication.model.DetalhesModel;

import java.util.ArrayList;
import java.util.List;

public class PaginaDetalhes extends AppCompatActivity {
    TextView nome,descricao;
    ImageView foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_detalhes);

        getSupportActionBar().hide();
        nome = findViewById(R.id.nome);
        descricao = findViewById(R.id.descricao);
        foto = findViewById(R.id.foto);


        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String nomeExtra = extras.getString("nome");
            String descricaoExtra = extras.getString("descricao");
            String precoExtra = extras.getString("preco");
            int imagemExtra = Integer.parseInt(extras.getString("foto"));
            nome.setText(nomeExtra);
            descricao.setText(descricaoExtra);
            foto.setImageResource(imagemExtra);

        }







    }
}
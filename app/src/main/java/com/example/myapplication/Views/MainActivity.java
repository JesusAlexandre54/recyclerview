package com.example.myapplication.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Adapter.ProdutoAdapter;
import com.example.myapplication.R;
import com.example.myapplication.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview_produto);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        getSupportActionBar().hide();




        //configurar adapter
        List<Produto> produto = new ArrayList<>();
        ProdutoAdapter produtoAdapter = new ProdutoAdapter(this, produto, new ProdutoAdapter.ItemClickListener() {
            @Override
            public void onItemclick(Produto details) {
                try {
                    //showToast(details.getNome()+"Clicked");
                    Intent intent = new Intent(MainActivity.this,PaginaDetalhes.class);
                intent.putExtra("nome",details.getNome());
                intent.putExtra("descricao",details.getDescricao());
                intent.putExtra("preco",details.getPreco());
                intent.putExtra("foto",String.valueOf(details.getFoto()));
                    startActivity(intent);

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, ""+ e, Toast.LENGTH_SHORT).show();
                }

            }
        });
        recyclerView.setAdapter(produtoAdapter);


        Produto produto1 = new Produto(
                R.drawable.cpu,
                "Sandisk",
                "A melhor CPU que existe",
                "R$ 1.200,00"

        );
        Produto produto2 = new Produto(
                R.drawable.controle_gamer,
                "Controle Gamer",
                "xuelili Controles sem fio para Xbox One, gamepad sem fio para PC com adaptador sem fio de 2,4 GHz, compatível com Xbox One / One S / One X / P3 Host / Windows 7/8/10",
                "R$ 150,00"

        );
        Produto produto3 = new Produto(
                R.drawable.controle_gamer,
                "Controle Gamer",
                "xuelili Controles sem fio para Xbox One, gamepad sem fio para PC com adaptador sem fio de 2,4 GHz, compatível com Xbox One / One S / One X / P3 Host / Windows 7/8/10",
                "R$ 150,00"

        );

        produto.add(produto1);
        produto.add(produto2);








    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
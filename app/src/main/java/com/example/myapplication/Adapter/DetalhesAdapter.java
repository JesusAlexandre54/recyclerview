package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.DetalhesModel;
import com.example.myapplication.model.Produto;

import java.util.List;

public class DetalhesAdapter extends RecyclerView.Adapter<DetalhesAdapter.ViewHolder> {

    Context context;
    List<DetalhesModel> list;


    public DetalhesAdapter(Context context, List<DetalhesModel> list) {
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public DetalhesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_individual,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetalhesAdapter.ViewHolder holder, int position) {
        holder.foto.setImageResource(list.get(position).getFoto());
        holder.nome.setText(list.get(position).getNome());
        holder.descricao.setText(list.get(position).getDescricao());
        holder.preco.setText(list.get(position).getPreco());
        holder.detalhes.setText(list.get(position).getDetalhes());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView foto;
        TextView nome, descricao,preco,detalhes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.foto_produto);
            nome = itemView.findViewById(R.id.nomeproduto);
            descricao = itemView.findViewById(R.id.descricao_produto);
            preco = itemView.findViewById(R.id.preco_produto);
            detalhes = itemView.findViewById(R.id.detalhes_produto);

        }
    }
}

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
import com.example.myapplication.model.Produto;

import java.util.List;

public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoAdapter.ViewHolder> {

    Context context;
    List<Produto> list;
    private ItemClickListener itemClickListener;

    public ProdutoAdapter(Context context, List<Produto> list, ItemClickListener itemClickListener) {
        this.context = context;
        this.list = list;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ProdutoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.hardware_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoAdapter.ViewHolder holder, int position) {
        holder.foto.setImageResource(list.get(position).getFoto());
        holder.nome.setText(list.get(position).getNome());
        holder.descricao.setText(list.get(position).getDescricao());
        holder.preco.setText(list.get(position).getPreco());

        holder.itemView.setOnClickListener(view -> {
            itemClickListener.onItemclick(list.get(position));
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface ItemClickListener{
        void onItemclick(Produto details);

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView foto;
        TextView nome, descricao,preco;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.foto_produto);
            nome = itemView.findViewById(R.id.nomeproduto);
            descricao = itemView.findViewById(R.id.descricao_produto);
            preco = itemView.findViewById(R.id.preco_produto);

        }
    }
}

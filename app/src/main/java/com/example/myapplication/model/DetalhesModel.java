package com.example.myapplication.model;

public class DetalhesModel {
    int foto;
    String nome,descricao,preco,detalhes;

    public DetalhesModel(int foto, String nome, String descricao, String preco, String detalhes) {
        this.foto = foto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.detalhes = detalhes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}

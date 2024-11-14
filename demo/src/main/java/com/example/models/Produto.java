package com.example.models;

public class Produto {
    private Integer id;
    private String nome;
    private String valor;
    private String marca;
    
    public Produto(Integer id, String nome, String valor, String marca) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
    }
  
    public Produto(String nome, String valor, String marca) {
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", Nome=" + nome + ", Valor=" + valor + ", Marca=" + marca + "]";
    }

}

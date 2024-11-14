package com.example.models;

public class Pedido {
    private Integer id;
    private String idUsuario;
    private String idProduto;
    private String quantidade;

    public Pedido(Integer id, String idUsuario, String idProduto, String quantidade) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public Pedido(String idUsuario, String idProduto, String quantidade) {
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", idUsuario=" + idUsuario + ", idProduto=" + idProduto + ", quantidade="
                + quantidade + "]";
    }

    

}

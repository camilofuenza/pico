package com.example.illinguinisigloxxi.Modelo;

public class Inventario {
    public int idInventario;
    public int stock;
    public int idProducto;
    public int idBodega;

    public Inventario(int idInventario, int stock, int idProducto, int idBodega) {
        this.idInventario = idInventario;
        this.stock = stock;
        this.idProducto = idProducto;
        this.idBodega = idBodega;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }
}

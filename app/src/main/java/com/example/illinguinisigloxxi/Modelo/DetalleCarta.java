package com.example.illinguinisigloxxi.Modelo;

public class DetalleCarta {
    public int idDetalleCarta;
    public int idCarta;
    public int idProducto;
    public int cantidadProducto;

    public DetalleCarta(int idDetalleCarta, int idCarta, int idProducto, int cantidadProducto) {
        this.idDetalleCarta = idDetalleCarta;
        this.idCarta = idCarta;
        this.idProducto = idProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public int getIdDetalleCarta() {
        return idDetalleCarta;
    }

    public void setIdDetalleCarta(int idDetalleCarta) {
        this.idDetalleCarta = idDetalleCarta;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}

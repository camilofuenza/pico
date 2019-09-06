package com.example.illinguinisigloxxi.Modelo;

public class DetalleOrden {

    public int idOrden;
    public int idCarta;

    public DetalleOrden(int idOrden, int idCarta) {
        this.idOrden = idOrden;
        this.idCarta = idCarta;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }
}

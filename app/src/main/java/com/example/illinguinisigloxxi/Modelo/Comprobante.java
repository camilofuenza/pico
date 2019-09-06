package com.example.illinguinisigloxxi.Modelo;

import java.util.Date;

public class Comprobante {
    public int idComprobante;
    public int idOrden;
    public int total;
    public Date fechaEmisionComprobante;
    public int TipoPago;

    public Comprobante(int idComprobante, int idOrden, int total, Date fechaEmisionComprobante, int tipoPago) {
        this.idComprobante = idComprobante;
        this.idOrden = idOrden;
        this.total = total;
        this.fechaEmisionComprobante = fechaEmisionComprobante;
        TipoPago = tipoPago;
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFechaEmisionComprobante() {
        return fechaEmisionComprobante;
    }

    public void setFechaEmisionComprobante(Date fechaEmisionComprobante) {
        this.fechaEmisionComprobante = fechaEmisionComprobante;
    }

    public int getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(int tipoPago) {
        TipoPago = tipoPago;
    }
}

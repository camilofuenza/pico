package com.example.illinguinisigloxxi.Modelo;

public class Caja {
    public int idCaja;
    public int ingresoCaja;
    public int idComprobante;
    public int comprobante_idComprobante;

    public Caja(int idCaja, int ingresoCaja, int idComprobante, int comprobante_idComprobante) {
        this.idCaja = idCaja;
        this.ingresoCaja = ingresoCaja;
        this.idComprobante = idComprobante;
        this.comprobante_idComprobante = comprobante_idComprobante;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public int getIngresoCaja() {
        return ingresoCaja;
    }

    public void setIngresoCaja(int ingresoCaja) {
        this.ingresoCaja = ingresoCaja;
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public int getComprobante_idComprobante() {
        return comprobante_idComprobante;
    }

    public void setComprobante_idComprobante(int comprobante_idComprobante) {
        this.comprobante_idComprobante = comprobante_idComprobante;
    }
}

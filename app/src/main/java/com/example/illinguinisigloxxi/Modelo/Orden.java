package com.example.illinguinisigloxxi.Modelo;

import java.util.Date;

public class Orden {
    public int idOrden;
    public int idMesa;
    public Date fechaEmisionOrden;
    public int idEstado;

    public Orden(int idOrden, int idMesa, Date fechaEmisionOrden, int idEstado) {
        this.idOrden = idOrden;
        this.idMesa = idMesa;
        this.fechaEmisionOrden = fechaEmisionOrden;
        this.idEstado = idEstado;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Date getFechaEmisionOrden() {
        return fechaEmisionOrden;
    }

    public void setFechaEmisionOrden(Date fechaEmisionOrden) {
        this.fechaEmisionOrden = fechaEmisionOrden;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
}

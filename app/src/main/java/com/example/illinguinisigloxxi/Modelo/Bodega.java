package com.example.illinguinisigloxxi.Modelo;

public class Bodega {

    public int idBodega;
    public String nombreBodega;
    public String direccionBodega;
    public int idSucursal;
    public int idEmpleado;

    public Bodega(int idBodega, String nombreBodega, String direccionBodega, int idSucursal, int idEmpleado) {
        this.idBodega = idBodega;
        this.nombreBodega = nombreBodega;
        this.direccionBodega = direccionBodega;
        this.idSucursal = idSucursal;
        this.idEmpleado = idEmpleado;
    }

    public int getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }

    public String getNombreBodega() {
        return nombreBodega;
    }

    public void setNombreBodega(String nombreBodega) {
        this.nombreBodega = nombreBodega;
    }

    public String getDireccionBodega() {
        return direccionBodega;
    }

    public void setDireccionBodega(String direccionBodega) {
        this.direccionBodega = direccionBodega;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}

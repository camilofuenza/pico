package com.example.illinguinisigloxxi.Modelo;

public class SolicitudProveedor {

    public int idSolicitudProveedor;
    public int ordenCompra;
    public int cantidadSolicitud;
    public int valorDetalleSolicitud;
    public int idProducto;
    public int idProveedor;
    public int idEmpleado;


    public SolicitudProveedor(int idSolicitudProveedor, int ordenCompra, int cantidadSolicitud, int valorDetalleSolicitud, int idProducto, int idProveedor, int idEmpleado) {
        this.idSolicitudProveedor = idSolicitudProveedor;
        this.ordenCompra = ordenCompra;
        this.cantidadSolicitud = cantidadSolicitud;
        this.valorDetalleSolicitud = valorDetalleSolicitud;
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
        this.idEmpleado = idEmpleado;
    }

    public int getIdSolicitudProveedor() {
        return idSolicitudProveedor;
    }

    public void setIdSolicitudProveedor(int idSolicitudProveedor) {
        this.idSolicitudProveedor = idSolicitudProveedor;
    }

    public int getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(int ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public int getCantidadSolicitud() {
        return cantidadSolicitud;
    }

    public void setCantidadSolicitud(int cantidadSolicitud) {
        this.cantidadSolicitud = cantidadSolicitud;
    }

    public int getValorDetalleSolicitud() {
        return valorDetalleSolicitud;
    }

    public void setValorDetalleSolicitud(int valorDetalleSolicitud) {
        this.valorDetalleSolicitud = valorDetalleSolicitud;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}

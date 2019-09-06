package com.example.illinguinisigloxxi.Modelo;

import java.util.Date;

public class PedidoProveedor {

    public int idPedidoProveedor;
    public int idEmpleado;
    public int tipoPagoSolicitud;
    public Date fechaEmisionSolicitud;
    public Date fechaEntregaSolicitud;
    public int totalPedidoProveedor;
    public int idProveedor;
    public int ordenCompra;
    public int idSolicitudPedido;

    public PedidoProveedor(int idPedidoProveedor, int idEmpleado, int tipoPagoSolicitud, Date fechaEmisionSolicitud, Date fechaEntregaSolicitud, int totalPedidoProveedor, int idProveedor, int ordenCompra, int idSolicitudPedido) {
        this.idPedidoProveedor = idPedidoProveedor;
        this.idEmpleado = idEmpleado;
        this.tipoPagoSolicitud = tipoPagoSolicitud;
        this.fechaEmisionSolicitud = fechaEmisionSolicitud;
        this.fechaEntregaSolicitud = fechaEntregaSolicitud;
        this.totalPedidoProveedor = totalPedidoProveedor;
        this.idProveedor = idProveedor;
        this.ordenCompra = ordenCompra;
        this.idSolicitudPedido = idSolicitudPedido;
    }

    public int getIdPedidoProveedor() {
        return idPedidoProveedor;
    }

    public void setIdPedidoProveedor(int idPedidoProveedor) {
        this.idPedidoProveedor = idPedidoProveedor;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getTipoPagoSolicitud() {
        return tipoPagoSolicitud;
    }

    public void setTipoPagoSolicitud(int tipoPagoSolicitud) {
        this.tipoPagoSolicitud = tipoPagoSolicitud;
    }

    public Date getFechaEmisionSolicitud() {
        return fechaEmisionSolicitud;
    }

    public void setFechaEmisionSolicitud(Date fechaEmisionSolicitud) {
        this.fechaEmisionSolicitud = fechaEmisionSolicitud;
    }

    public Date getFechaEntregaSolicitud() {
        return fechaEntregaSolicitud;
    }

    public void setFechaEntregaSolicitud(Date fechaEntregaSolicitud) {
        this.fechaEntregaSolicitud = fechaEntregaSolicitud;
    }

    public int getTotalPedidoProveedor() {
        return totalPedidoProveedor;
    }

    public void setTotalPedidoProveedor(int totalPedidoProveedor) {
        this.totalPedidoProveedor = totalPedidoProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(int ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public int getIdSolicitudPedido() {
        return idSolicitudPedido;
    }

    public void setIdSolicitudPedido(int idSolicitudPedido) {
        this.idSolicitudPedido = idSolicitudPedido;
    }
}

package com.example.illinguinisigloxxi.Modelo;

import java.util.Date;

public class Reserva {
    public int idReserva;
    public String rutCliente;
    public String nombreCliente;
    public Date fechaEmisionReserva;
    public Date fechaReserva;
    public int cantidadPersonas;
    public String telefonoCliente;
    public int idMesa;

    public Reserva(int idReserva, String rutCliente, String nombreCliente, Date fechaEmisionReserva, Date fechaReserva, int cantidadPersonas, String telefonoCliente, int idMesa) {
        this.idReserva = idReserva;
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.fechaEmisionReserva = fechaEmisionReserva;
        this.fechaReserva = fechaReserva;
        this.cantidadPersonas = cantidadPersonas;
        this.telefonoCliente = telefonoCliente;
        this.idMesa = idMesa;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaEmisionReserva() {
        return fechaEmisionReserva;
    }

    public void setFechaEmisionReserva(Date fechaEmisionReserva) {
        this.fechaEmisionReserva = fechaEmisionReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
}

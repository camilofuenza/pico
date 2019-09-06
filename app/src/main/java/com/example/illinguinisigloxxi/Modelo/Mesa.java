package com.example.illinguinisigloxxi.Modelo;

public class Mesa {

    public int idMesa;
    public int idEstado;
    public int idEmpleado;

    public Mesa(int idMesa, int idEstado, int idEmpleado) {
        this.idMesa = idMesa;
        this.idEstado = idEstado;
        this.idEmpleado = idEmpleado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }


    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}

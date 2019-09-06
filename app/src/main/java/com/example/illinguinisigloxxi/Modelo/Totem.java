package com.example.illinguinisigloxxi.Modelo;

import java.util.Date;

public class Totem {
    public int idTotem;
    public Date horaLlegada;
    public int idMesa;

    public Totem(int idTotem, Date horaLlegada, int idMesa) {
        this.idTotem = idTotem;
        this.horaLlegada = horaLlegada;
        this.idMesa = idMesa;
    }

    public int getIdTotem() {
        return idTotem;
    }

    public void setIdTotem(int idTotem) {
        this.idTotem = idTotem;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
}

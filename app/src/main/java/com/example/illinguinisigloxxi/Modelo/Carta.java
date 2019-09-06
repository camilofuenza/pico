package com.example.illinguinisigloxxi.Modelo;

public class Carta {
    public int idCarta;
    public String nombreCarta;
    public int valorCarta;

    public Carta(int idCarta, String nombreCarta, int valorCarta) {
        this.idCarta = idCarta;
        this.nombreCarta = nombreCarta;
        this.valorCarta = valorCarta;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }

    public String getNombreCarta() {
        return nombreCarta;
    }

    public void setNombreCarta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    public int getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(int valorCarta) {
        this.valorCarta = valorCarta;
    }
}

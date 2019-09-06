package com.example.illinguinisigloxxi.Modelo;

public class Comuna {
    public int idComuna;
    public String nombreComuna;
    public int idCiudad;

    public Comuna(int idComuna, String nombreComuna, int idCiudad) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
        this.idCiudad = idCiudad;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
}

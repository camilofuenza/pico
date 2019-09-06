package com.example.illinguinisigloxxi.Modelo;

public class Ciudad {
    public int idCiudad;
    public String nombreCiudad;
    public int idRegion;

    public Ciudad(int idCiudad, String nombreCiudad, int idRegion) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.idRegion = idRegion;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }
}

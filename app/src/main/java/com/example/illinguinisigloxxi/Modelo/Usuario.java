package com.example.illinguinisigloxxi.Modelo;

public class Usuario {
    private int idRol;
    private String username;
    private String password;

    public Usuario(int idRol,String username, String password){
        this.idRol=idRol;
        this.username=username;
        this.password=password;

    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

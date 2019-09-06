package com.example.illinguinisigloxxi.Modelo;

public class Logs {
    public int idLog;
    public String descripcionLog;
    public String tipoLog;

    public Logs(int idLog, String descripcionLog, String tipoLog) {
        this.idLog = idLog;
        this.descripcionLog = descripcionLog;
        this.tipoLog = tipoLog;
    }

    public int getIdLog() {
        return idLog;
    }

    public void setIdLog(int idLog) {
        this.idLog = idLog;
    }

    public String getDescripcionLog() {
        return descripcionLog;
    }

    public void setDescripcionLog(String descripcionLog) {
        this.descripcionLog = descripcionLog;
    }

    public String getTipoLog() {
        return tipoLog;
    }

    public void setTipoLog(String tipoLog) {
        this.tipoLog = tipoLog;
    }
}

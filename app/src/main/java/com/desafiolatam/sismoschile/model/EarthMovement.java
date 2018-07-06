package com.desafiolatam.sismoschile.model;

public class EarthMovement {

    private String Fecha,Latitud,Longitud,Profundidad,Magnitud,Agencia, RefGeografica,FechaUpdate;

    public EarthMovement() {
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String latitud) {
        Latitud = latitud;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String longitud) {
        Longitud = longitud;
    }

    public String getProfundidad() {
        return Profundidad;
    }

    public void setProfundidad(String profundidad) {
        Profundidad = profundidad;
    }

    public String getMagnitud() {
        return Magnitud;
    }

    public void setMagnitud(String magnitud) {
        Magnitud = magnitud;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getRefGeografica() {
        return RefGeografica;
    }

    public void setRefGeografica(String refGeografica) {
        RefGeografica = refGeografica;
    }

    public String getFechaUpdate() {
        return FechaUpdate;
    }

    public void setFechaUpdate(String fechaUpdate) {
        FechaUpdate = fechaUpdate;
    }



    public String resultInfo() {

           return
                   " Fecha: "+ getFecha()+ '\n'
                   +
                   " Latitud: "+ getLatitud()+ '\n'
                   +
                   " Longitud: "+ getLongitud()+ '\n'
                   +
                   " Profundidad: "+ getProfundidad()+ '\n'
                   +
                   " Magnitud: "+ getMagnitud()+ '\n'
                   +
                   " Agencia: "+ getAgencia()+ '\n'
                   +
                   " Referencia Geografica: "+ getRefGeografica()+ '\n'
                   +
                   " Fecha de Actualizacion: "+ getFechaUpdate();

    }
}

package com.upiiz.trabajadores.models;

import java.util.Date;

public class Trabajadores {
    private Long id;
    private String nombre;
    private Long ocupacion_id;
    private Date tiempo_acutacion;

    public Trabajadores(Long id, String nombre, Long ocupacion_id, Date tiempo_acutacion) {
        this.id = id;
        this.nombre = nombre;
        this.ocupacion_id = ocupacion_id;
        this.tiempo_acutacion = tiempo_acutacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getOcupacion_id() {
        return ocupacion_id;
    }

    public void setOcupacion_id(Long ocupacion_id) {
        this.ocupacion_id = ocupacion_id;
    }

    public Date getTiempo_acutacion() {
        return tiempo_acutacion;
    }

    public void setTiempo_acutacion(Date tiempo_acutacion) {
        this.tiempo_acutacion = tiempo_acutacion;
    }
}

package com.upiiz.trabajadores.models;

public class Trabajadores_palabra {
    private Long id;
    private Long trabajadorrespuesta_id;

    public Trabajadores_palabra(Long id, Long trabajadorrespuesta_id) {
        this.id = id;
        this.trabajadorrespuesta_id = trabajadorrespuesta_id;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrabajadorrespuesta_id() {
        return trabajadorrespuesta_id;
    }

    public void setTrabajadorrespuesta_id(Long trabajadorrespuesta_id) {
        this.trabajadorrespuesta_id = trabajadorrespuesta_id;
    }

}

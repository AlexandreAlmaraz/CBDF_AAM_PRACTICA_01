package com.upiiz.trabajadores.models;

public class Tabajadores_respuesta {
    private Long id;
    private String respuesta;
    private Long pregunta_id;
    private Long trabajador_id;

    public Tabajadores_respuesta(String respuesta, Long id, Long pregunta_id, Long trabajador_id) {
        this.respuesta = respuesta;
        this.id = id;
        this.pregunta_id = pregunta_id;
        this.trabajador_id = trabajador_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Long getPregunta_id() {
        return pregunta_id;
    }

    public void setPregunta_id(Long pregunta_id) {
        this.pregunta_id = pregunta_id;
    }

    public Long getTrabajador_id() {
        return trabajador_id;
    }

    public void setTrabajador_id(Long trabajador_id) {
        this.trabajador_id = trabajador_id;
    }

}

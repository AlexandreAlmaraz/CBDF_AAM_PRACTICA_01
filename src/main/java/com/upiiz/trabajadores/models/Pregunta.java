package com.upiiz.trabajadores.models;

public class Pregunta {
    private Long id;
    private String pregunta;

    public Pregunta(Long id, String pregunta) {
        this.id = id;
        this.pregunta = pregunta;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

}

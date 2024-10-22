package com.upiiz.trabajadores.models;

public class Stopword {
    private Long id;
    private String termino;
    private String comparar;

    public Stopword(Long id, String termino, String comparar) {
        this.id = id;
        this.termino = termino;
        this.comparar = comparar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public String getComparar() {
        return comparar;
    }

    public void setComparar(String comparar) {
        this.comparar = comparar;
    }
}

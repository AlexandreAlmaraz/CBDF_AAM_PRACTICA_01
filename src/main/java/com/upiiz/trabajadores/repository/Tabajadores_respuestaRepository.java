package com.upiiz.trabajadores.repository;

import com.upiiz.trabajadores.models.Tabajadores_respuesta;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class Tabajadores_respuestaRepository {

    private List<Tabajadores_respuesta> respuestas = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Tabajadores_respuesta guardar(Tabajadores_respuesta respuesta) {
        respuesta.setId(id.incrementAndGet());
        respuestas.add(respuesta);
        return respuesta;
    }

    public List<Tabajadores_respuesta> obtenerTodas() {
        return respuestas;
    }

    public Tabajadores_respuesta obtenerPorId(Long id) {
        return respuestas.stream().filter(respuesta -> respuesta.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id) {
        respuestas.removeIf(respuesta -> respuesta.getId().equals(id));
    }

    public Tabajadores_respuesta actualizar(Tabajadores_respuesta respuesta) {
        eliminar(respuesta.getId());
        respuestas.add(respuesta);
        return respuesta;
    }

    public List<Tabajadores_respuesta> getAllTrabajadores_respuestaByPregunta_id(Long pregunta_id) {
        return respuestas.stream().filter(respuesta -> respuesta.getPregunta_id().equals(pregunta_id)).toList();
    }

    public List<Tabajadores_respuesta> getAllTrabajadores_respuestaByTrabajador_id(Long trabajador_id) {
        return respuestas.stream().filter(respuesta -> respuesta.getTrabajador_id().equals(trabajador_id)).toList();
    }

}

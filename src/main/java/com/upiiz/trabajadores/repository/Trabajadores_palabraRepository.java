package com.upiiz.trabajadores.repository;

import com.upiiz.trabajadores.models.Tabajadores_respuesta;
import com.upiiz.trabajadores.models.Trabajadores_palabra;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class Trabajadores_palabraRepository {

    private List<Trabajadores_palabra> trabajadoresPalabras = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Trabajadores_palabra guardar(Trabajadores_palabra trabajadoresPalabra) {
        trabajadoresPalabra.setId(id.incrementAndGet());
        trabajadoresPalabras.add(trabajadoresPalabra);
        return trabajadoresPalabra;
    }

    public List<Trabajadores_palabra> obtenerTodos() {
        return trabajadoresPalabras;
    }

    public Trabajadores_palabra obtenerPorId(Long id) {
        return trabajadoresPalabras.stream().filter(trabajadoresPalabra -> trabajadoresPalabra.getId().equals(id))
                .findFirst().orElse(null);
    }

    public void eliminar(Long id) {
        trabajadoresPalabras.removeIf(trabajadoresPalabra -> trabajadoresPalabra.getId().equals(id));
    }

    public Trabajadores_palabra actualizar(Trabajadores_palabra trabajadoresPalabra) {
        eliminar(trabajadoresPalabra.getId());
        trabajadoresPalabras.add(trabajadoresPalabra);
        return trabajadoresPalabra;
    }

    public List<Trabajadores_palabra> getAllTrabajadores_palabraByPregunta_id(Long trabajadorrespuesta_id) {
        return trabajadoresPalabras.stream().filter(trabajadoresPalabra-> trabajadoresPalabra.getTrabajadorrespuesta_id().equals(trabajadorrespuesta_id)).toList();
    }
}

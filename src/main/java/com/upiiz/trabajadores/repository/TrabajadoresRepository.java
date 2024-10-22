package com.upiiz.trabajadores.repository;

import com.upiiz.trabajadores.models.Trabajadores;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TrabajadoresRepository {

    private List<Trabajadores> trabajadores = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Trabajadores guardar(Trabajadores trabajador) {
        trabajador.setId(id.incrementAndGet());
        trabajadores.add(trabajador);
        return trabajador;
    }

    public List<Trabajadores> obtenerTodos() {
        return trabajadores;
    }

    public Trabajadores obtenerPorId(Long id) {
        return trabajadores.stream().filter(trabajador -> trabajador.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id) {
        trabajadores.removeIf(trabajador -> trabajador.getId().equals(id));
    }

    public Trabajadores actualizar(Trabajadores trabajador) {
        eliminar(trabajador.getId());
        trabajadores.add(trabajador);
        return trabajador;
    }
}

package com.upiiz.trabajadores.repository;

import org.springframework.stereotype.Repository;
import com.upiiz.trabajadores.models.Pregunta;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PreguntaRepository {

    private List<Pregunta> preguntas = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Pregunta guardar(Pregunta pregunta) {
        pregunta.setId(id.incrementAndGet());
        preguntas.add(pregunta);
        return pregunta;
    }

    public List<Pregunta> obtenerTodas() {
        return preguntas;
    }

    public Pregunta obtenerPorId(Long id) {
        return preguntas.stream().filter(pregunta -> pregunta.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id) {
        preguntas.removeIf(pregunta -> pregunta.getId().equals(id));
    }

    public Pregunta actualizar(Pregunta pregunta) {
        eliminar(pregunta.getId());
        preguntas.add(pregunta);
        return pregunta;
    }

}

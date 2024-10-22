package com.upiiz.trabajadores.services;

import com.upiiz.trabajadores.models.Pregunta;
import com.upiiz.trabajadores.repository.PreguntaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaServices {

    private final PreguntaRepository preguntaRepository;

    public PreguntaServices(PreguntaRepository preguntaRepository) {
        this.preguntaRepository = preguntaRepository;
    }

    public List<Pregunta> getAllPreguntas() {
        return preguntaRepository.obtenerTodas();
    }

    public Pregunta getPreguntaById(Long id) {
        return preguntaRepository.obtenerPorId(id);
    }

    public Pregunta createPregunta(Pregunta pregunta) {
        return preguntaRepository.guardar(pregunta);
    }

    public Pregunta updatePregunta(Pregunta pregunta) {
        return preguntaRepository.actualizar(pregunta);
    }

    public void deletePregunta(Long id) {
        preguntaRepository.eliminar(id);
    }

}

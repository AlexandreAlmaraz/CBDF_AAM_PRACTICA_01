package com.upiiz.trabajadores.services;

import com.upiiz.trabajadores.models.Tabajadores_respuesta;
import com.upiiz.trabajadores.repository.Tabajadores_respuestaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tabajadores_respuestaServices {

    private final Tabajadores_respuestaRepository respuestaRepository;

    public Tabajadores_respuestaServices(Tabajadores_respuestaRepository respuestaRepository) {
        this.respuestaRepository = respuestaRepository;
    }

    public List<Tabajadores_respuesta> getAllRespuestas() {
        return respuestaRepository.obtenerTodas();
    }

    public Tabajadores_respuesta getRespuestaById(Long id) {
        return respuestaRepository.obtenerPorId(id);
    }

    public Tabajadores_respuesta createRespuesta(Tabajadores_respuesta respuesta) {
        return respuestaRepository.guardar(respuesta);
    }

    public Tabajadores_respuesta updateRespuesta(Tabajadores_respuesta respuesta) {
        return respuestaRepository.actualizar(respuesta);
    }

    public void deleteRespuesta(Long id) {
        respuestaRepository.eliminar(id);
    }

    public List<Tabajadores_respuesta> getAllTrabajadores_respuestaByPregunta_id(Long pregunta_id) {
        return this.respuestaRepository.getAllTrabajadores_respuestaByPregunta_id(pregunta_id);
    }

    public List<Tabajadores_respuesta> getAllTrabajadores_respuestaByTrabajador_id(Long trabajador_id) {
        return this.respuestaRepository.getAllTrabajadores_respuestaByTrabajador_id(trabajador_id);
    }
}

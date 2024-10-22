package com.upiiz.trabajadores.services;

import com.upiiz.trabajadores.models.Tabajadores_respuesta;
import com.upiiz.trabajadores.models.Trabajadores_palabra;
import com.upiiz.trabajadores.repository.Trabajadores_palabraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Trabajadores_palabraServices {

    private final Trabajadores_palabraRepository trabajadoresPalabraRepository;

    public Trabajadores_palabraServices(Trabajadores_palabraRepository trabajadoresPalabraRepository) {
        this.trabajadoresPalabraRepository = trabajadoresPalabraRepository;
    }

    public List<Trabajadores_palabra> getAllTrabajadoresPalabras() {
        return trabajadoresPalabraRepository.obtenerTodos();
    }

    public Trabajadores_palabra getTrabajadoresPalabraById(Long id) {
        return trabajadoresPalabraRepository.obtenerPorId(id);
    }

    public Trabajadores_palabra createTrabajadoresPalabra(Trabajadores_palabra trabajadoresPalabra) {
        return trabajadoresPalabraRepository.guardar(trabajadoresPalabra);
    }

    public Trabajadores_palabra updateTrabajadoresPalabra(Trabajadores_palabra trabajadoresPalabra) {
        return trabajadoresPalabraRepository.actualizar(trabajadoresPalabra);
    }

    public void deleteTrabajadoresPalabra(Long id) {
        trabajadoresPalabraRepository.eliminar(id);
    }

    public List<Trabajadores_palabra> getAllTrabajadores_palabraByPregunta_id(Long trabajadorrespuesta_id) {
        return this.trabajadoresPalabraRepository.getAllTrabajadores_palabraByPregunta_id(trabajadorrespuesta_id);
    }
}

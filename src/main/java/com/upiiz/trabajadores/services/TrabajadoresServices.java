package com.upiiz.trabajadores.services;

import com.upiiz.trabajadores.models.Trabajadores;
import com.upiiz.trabajadores.repository.TrabajadoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadoresServices {

    private final TrabajadoresRepository trabajadoresRepository;

    public TrabajadoresServices(TrabajadoresRepository trabajadoresRepository) {
        this.trabajadoresRepository = trabajadoresRepository;
    }

    public List<Trabajadores> getAllTrabajadores() {
        return trabajadoresRepository.obtenerTodos();
    }

    public Trabajadores getTrabajadorById(Long id) {
        return trabajadoresRepository.obtenerPorId(id);
    }

    public Trabajadores createTrabajador(Trabajadores trabajador) {
        return trabajadoresRepository.guardar(trabajador);
    }

    public Trabajadores updateTrabajador(Trabajadores trabajador) {
        return trabajadoresRepository.actualizar(trabajador);
    }

    public void deleteTrabajador(Long id) {
        trabajadoresRepository.eliminar(id);
    }
}

package com.upiiz.trabajadores.services;

import com.upiiz.trabajadores.models.Stopword;
import com.upiiz.trabajadores.repository.StopwordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopwordServices {

    private final StopwordRepository stopwordRepository;

    public StopwordServices(StopwordRepository stopwordRepository) {
        this.stopwordRepository = stopwordRepository;
    }

    public List<Stopword> getAllStopwords() {
        return stopwordRepository.obtenerTodas();
    }

    public Stopword getStopwordById(Long id) {
        return stopwordRepository.obtenerPorId(id);
    }

    public Stopword createStopword(Stopword stopword) {
        return stopwordRepository.guardar(stopword);
    }

    public Stopword updateStopword(Stopword stopword) {
        return stopwordRepository.actualizar(stopword);
    }

    public void deleteStopword(Long id) {
        stopwordRepository.eliminar(id);
    }
}

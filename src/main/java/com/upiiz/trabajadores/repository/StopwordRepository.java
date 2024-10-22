package com.upiiz.trabajadores.repository;

import com.upiiz.trabajadores.models.Stopword;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class StopwordRepository {

    private List<Stopword> stopwords = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Stopword guardar(Stopword stopword) {
        stopword.setId(id.incrementAndGet());
        stopwords.add(stopword);
        return stopword;
    }

    public List<Stopword> obtenerTodas() {
        return stopwords;
    }

    public Stopword obtenerPorId(Long id) {
        return stopwords.stream().filter(stopword -> stopword.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id) {
        stopwords.removeIf(stopword -> stopword.getId().equals(id));
    }

    public Stopword actualizar(Stopword stopword) {
        eliminar(stopword.getId());
        stopwords.add(stopword);
        return stopword;
    }
}

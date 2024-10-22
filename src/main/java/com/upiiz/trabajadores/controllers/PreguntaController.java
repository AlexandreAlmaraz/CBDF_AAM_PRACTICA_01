package com.upiiz.trabajadores.controllers;

import com.upiiz.trabajadores.models.Pregunta;
import com.upiiz.trabajadores.services.PreguntaServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/preguntas")
public class PreguntaController {

    private final PreguntaServices preguntaService;

    public PreguntaController(PreguntaServices preguntaService) {
        this.preguntaService = preguntaService;
    }

    @GetMapping
    public ResponseEntity<List<Pregunta>> getPreguntas() {
        return ResponseEntity.ok(preguntaService.getAllPreguntas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pregunta> getPregunta(@PathVariable Long id) {
        return ResponseEntity.ok(preguntaService.getPreguntaById(id));
    }

    @PostMapping
    public ResponseEntity<Pregunta> addPregunta(@RequestBody Pregunta pregunta) {
        return ResponseEntity.ok(preguntaService.createPregunta(pregunta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pregunta> updatePregunta(@RequestBody Pregunta pregunta, @PathVariable Long id) {
        pregunta.setId(id);
        return ResponseEntity.ok(preguntaService.updatePregunta(pregunta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePregunta(@PathVariable Long id) {
        preguntaService.deletePregunta(id);
        return ResponseEntity.noContent().build();
    }

}

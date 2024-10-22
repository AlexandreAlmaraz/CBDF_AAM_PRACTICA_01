package com.upiiz.trabajadores.controllers;

import com.upiiz.trabajadores.models.Tabajadores_respuesta;
import com.upiiz.trabajadores.services.Tabajadores_respuestaServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trabajadores_respuestas")
public class Tabajadores_respuestaController {

    private final Tabajadores_respuestaServices respuestaService;

    public Tabajadores_respuestaController(Tabajadores_respuestaServices respuestaService) {
        this.respuestaService = respuestaService;
    }

    @GetMapping
    public ResponseEntity<List<Tabajadores_respuesta>> getRespuestas() {
        return ResponseEntity.ok(respuestaService.getAllRespuestas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tabajadores_respuesta> getRespuesta(@PathVariable Long id) {
        return ResponseEntity.ok(respuestaService.getRespuestaById(id));
    }

    @PostMapping
    public ResponseEntity<Tabajadores_respuesta> addRespuesta(@RequestBody Tabajadores_respuesta respuesta) {
        return ResponseEntity.ok(respuestaService.createRespuesta(respuesta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tabajadores_respuesta> updateRespuesta(@RequestBody Tabajadores_respuesta respuesta,
            @PathVariable Long id) {
        respuesta.setId(id);
        return ResponseEntity.ok(respuestaService.updateRespuesta(respuesta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRespuesta(@PathVariable Long id) {
        respuestaService.deleteRespuesta(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/preguntas/{id}")
    public ResponseEntity<List<Tabajadores_respuesta>> getAllTrabajadores_respuestaByPregunta_id(
            @PathVariable Long id) {
        return ResponseEntity.ok(this.respuestaService.getAllTrabajadores_respuestaByPregunta_id(id));
    }

    @GetMapping("/trabajadores/{id}")
    public ResponseEntity<List<Tabajadores_respuesta>> getAllTrabajadores_respuestaByTrabajador_id(
            @PathVariable Long id) {
        return ResponseEntity.ok(this.respuestaService.getAllTrabajadores_respuestaByTrabajador_id(id));
    }
}

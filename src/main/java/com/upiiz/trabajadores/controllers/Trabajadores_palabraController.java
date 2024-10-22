package com.upiiz.trabajadores.controllers;

import com.upiiz.trabajadores.models.Tabajadores_respuesta;
import com.upiiz.trabajadores.models.Trabajadores_palabra;
import com.upiiz.trabajadores.services.Trabajadores_palabraServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trabajadores_palabras")
public class Trabajadores_palabraController {

    private final Trabajadores_palabraServices trabajadoresPalabraService;

    public Trabajadores_palabraController(Trabajadores_palabraServices trabajadoresPalabraService) {
        this.trabajadoresPalabraService = trabajadoresPalabraService;
    }

    @GetMapping
    public ResponseEntity<List<Trabajadores_palabra>> getTrabajadoresPalabras() {
        return ResponseEntity.ok(trabajadoresPalabraService.getAllTrabajadoresPalabras());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trabajadores_palabra> getTrabajadoresPalabra(@PathVariable Long id) {
        return ResponseEntity.ok(trabajadoresPalabraService.getTrabajadoresPalabraById(id));
    }

    @PostMapping
    public ResponseEntity<Trabajadores_palabra> addTrabajadoresPalabra(
            @RequestBody Trabajadores_palabra trabajadoresPalabra) {
        return ResponseEntity.ok(trabajadoresPalabraService.createTrabajadoresPalabra(trabajadoresPalabra));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trabajadores_palabra> updateTrabajadoresPalabra(
            @RequestBody Trabajadores_palabra trabajadoresPalabra, @PathVariable Long id) {
        trabajadoresPalabra.setId(id);
        return ResponseEntity.ok(trabajadoresPalabraService.updateTrabajadoresPalabra(trabajadoresPalabra));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrabajadoresPalabra(@PathVariable Long id) {
        trabajadoresPalabraService.deleteTrabajadoresPalabra(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/trabajadores_respuestas/{id}")
    public ResponseEntity<List<Trabajadores_palabra>> getAllTrabajadores_palabraByPregunta_id(
            @PathVariable Long id) {
        return ResponseEntity.ok(this.trabajadoresPalabraService.getAllTrabajadores_palabraByPregunta_id(id));
    }
}

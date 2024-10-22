package com.upiiz.trabajadores.controllers;

import com.upiiz.trabajadores.models.Trabajadores;
import com.upiiz.trabajadores.services.TrabajadoresServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/trabajadores")
public class TrabajadoresController {

    private final TrabajadoresServices trabajadoresService;

    public TrabajadoresController(TrabajadoresServices trabajadoresService) {
        this.trabajadoresService = trabajadoresService;
    }

    @GetMapping
    public ResponseEntity<List<Trabajadores>> getTrabajadores() {
        return ResponseEntity.ok(trabajadoresService.getAllTrabajadores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trabajadores> getTrabajador(@PathVariable Long id) {
        return ResponseEntity.ok(trabajadoresService.getTrabajadorById(id));
    }

    @PostMapping
    public ResponseEntity<Trabajadores> addTrabajador(@RequestBody Trabajadores trabajador) {
        return ResponseEntity.ok(trabajadoresService.createTrabajador(trabajador));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trabajadores> updateTrabajador(@RequestBody Trabajadores trabajador, @PathVariable Long id) {
        trabajador.setId(id);
        return ResponseEntity.ok(trabajadoresService.updateTrabajador(trabajador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrabajador(@PathVariable Long id) {
        trabajadoresService.deleteTrabajador(id);
        return ResponseEntity.noContent().build();
    }
}

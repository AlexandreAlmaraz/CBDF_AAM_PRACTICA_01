package com.upiiz.trabajadores.controllers;

import com.upiiz.trabajadores.models.Stopword;
import com.upiiz.trabajadores.services.StopwordServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stopwords")
public class StopwordController {

    private final StopwordServices stopwordService;

    public StopwordController(StopwordServices stopwordService) {
        this.stopwordService = stopwordService;
    }

    @GetMapping
    public ResponseEntity<List<Stopword>> getStopwords() {
        return ResponseEntity.ok(stopwordService.getAllStopwords());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stopword> getStopword(@PathVariable Long id) {
        return ResponseEntity.ok(stopwordService.getStopwordById(id));
    }

    @PostMapping
    public ResponseEntity<Stopword> addStopword(@RequestBody Stopword stopword) {
        return ResponseEntity.ok(stopwordService.createStopword(stopword));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stopword> updateStopword(@RequestBody Stopword stopword, @PathVariable Long id) {
        stopword.setId(id);
        return ResponseEntity.ok(stopwordService.updateStopword(stopword));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStopword(@PathVariable Long id) {
        stopwordService.deleteStopword(id);
        return ResponseEntity.noContent().build();
    }
}

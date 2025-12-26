package com.poesia.poesia.controller;

import com.poesia.poesia.entity.Poesia;
import com.poesia.poesia.service.PoesiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/poesias")
@CrossOrigin(origins = "*") // IMPORTANTE: Esto permite que tu Frontend (HTML) llame a este Backend sin bloqueo
public class PoesiaController {

    @Autowired
    private PoesiaService service;

    // GET localhost:8080/api/poesias
    @GetMapping
    public List<Poesia> getAll() {
        return service.findAll();
    }

    // GET localhost:8080/api/poesias/1
    @GetMapping("/{id}")
    public Poesia getOne(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    // POST localhost:8080/api/poesias
    @PostMapping
    public Poesia create(@RequestBody Poesia poesia) {
        return service.save(poesia);
    }

    // DELETE localhost:8080/api/poesias/1
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
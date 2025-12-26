package com.poesia.poesia.service;

import com.poesia.poesia.entity.Poesia;
import com.poesia.poesia.repository.PoesiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PoesiaService {

    @Autowired
    private PoesiaRepository repository;

    // 1. Guardar un poema (Crear o Editar)
    public Poesia save(Poesia poesia) {
        return repository.save(poesia);
    }

    // 2. Listar todos (Para el Admin o usuarios VIP)
    public List<Poesia> findAll() {
        return repository.findAll();
    }

    // 3. Buscar por ID
    public Optional<Poesia> findById(Long id) {
        return repository.findById(id);
    }

    // 4. Borrar
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
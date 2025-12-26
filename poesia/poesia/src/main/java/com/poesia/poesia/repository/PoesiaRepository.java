package com.poesia.poesia.repository;

import com.poesia.poesia.entity.Poesia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoesiaRepository extends JpaRepository<Poesia, Long> {
    // ¡Magia! No necesitas escribir código para guardar, borrar o buscar.
    // Al extender JpaRepository, Spring Boot ya sabe hacer todo eso por ti.
}

package com.poesia.poesia.repository;

import com.poesia.poesia.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Método mágico: Spring crea el código SQL por nosotros al ver el nombre
    Optional<Usuario> findByEmail(String email);
}
package com.poesia.poesia.controller;

import com.poesia.poesia.entity.Usuario;
import com.poesia.poesia.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // REGISTRO: Crear un usuario nuevo
    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario) {
        // Por defecto, nadie nace siendo Premium (tienen que pagar después)
        usuario.setPremium(false);
        return usuarioRepository.save(usuario);
    }

    // LOGIN: Comprobar si email y contraseña coinciden
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario loginRequest) {
        // 1. Buscamos al usuario por su email
        Usuario usuarioEncontrado = usuarioRepository.findByEmail(loginRequest.getEmail())
                .orElse(null);

        // 2. Si existe Y la contraseña coincide, lo dejamos pasar
        if (usuarioEncontrado != null && usuarioEncontrado.getPassword().equals(loginRequest.getPassword())) {
            return usuarioEncontrado;
        }

        // 3. Si no, devolvemos null (o podríamos lanzar error)
        return null;
    }
}
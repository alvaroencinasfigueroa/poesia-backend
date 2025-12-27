package com.poesia.poesia.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // "unique = true" impide que dos personas se registren con el mismo correo
    @Column(unique = true)
    private String email;

    private String password;

    private String nombre;

    // Si es true, puede ver contenido de pago. Si es false, solo lo gratis.
    private boolean isPremium;
}
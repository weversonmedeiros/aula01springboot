package com.example.aula01.inicial_java.controllers;

import com.example.aula01.inicial_java.model.Usuario;
import com.example.aula01.inicial_java.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("usuarios")
@RequiredArgsConstructor
@RestController
public class UsuarioController {


    private final UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarUsuarios() {


        return ResponseEntity.ok(usuarioService.buscarTodosUsuarios());
    }

}

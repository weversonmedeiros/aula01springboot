package com.example.aula01.inicial_java.services;

import com.example.aula01.inicial_java.model.Usuario;
import com.example.aula01.inicial_java.repository.UsuarioRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<Usuario> buscarTodosUsuarios() {

        return usuarioRepository.findAll();
    }

    @PostConstruct
    public void salvarUsuario() {

        List<Usuario> listaUsuario = new ArrayList();

        Usuario usuario1 = Usuario
                .builder()
                .cpf("05304464052")
                .nome("Usuario1")
                .email("usuario@gmail.com.br")
                .build();
        Usuario usuario2 = Usuario
                .builder()
                .cpf("05304464052")
                .nome("Usuario2")
                .email("usuario@gmail.com.br")
                .build();

        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);

        usuarioRepository.saveAll(listaUsuario);

    }
}

package com.example.aula01.inicial_java.repository;

import com.example.aula01.inicial_java.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}

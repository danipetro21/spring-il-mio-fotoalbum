package com.java.daniele.fotoalbum.repository;

import com.java.daniele.fotoalbum.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {
}

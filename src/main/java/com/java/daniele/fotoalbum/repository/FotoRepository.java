package com.java.daniele.fotoalbum.repository;

import com.java.daniele.fotoalbum.model.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepository extends JpaRepository <Foto, Integer> {
}

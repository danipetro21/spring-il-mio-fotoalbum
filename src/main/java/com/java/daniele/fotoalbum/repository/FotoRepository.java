package com.java.daniele.fotoalbum.repository;

import com.java.daniele.fotoalbum.model.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FotoRepository extends JpaRepository<Foto, Integer> {

    List<Foto> findByTitleContainingIgnoreCase(String title);

}

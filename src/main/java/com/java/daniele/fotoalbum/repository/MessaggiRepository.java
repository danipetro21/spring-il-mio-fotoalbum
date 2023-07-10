package com.java.daniele.fotoalbum.repository;

import com.java.daniele.fotoalbum.model.Messaggi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessaggiRepository extends JpaRepository <Messaggi, Integer> {
}

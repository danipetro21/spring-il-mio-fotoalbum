package com.java.daniele.fotoalbum.controller;


import com.java.daniele.fotoalbum.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {


    @Autowired
    CategoriaRepository categoriaRepository;



}

package com.java.daniele.fotoalbum.controller;


import com.java.daniele.fotoalbum.model.Foto;
import com.java.daniele.fotoalbum.repository.CategoriaRepository;
import com.java.daniele.fotoalbum.repository.FotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/foto")
public class FotoController {

    @Autowired
    private FotoRepository fotoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("/lista")
    public String listFoto(Model model){


        List<Foto> listaFoto;

        listaFoto = fotoRepository.findAll();

        model.addAttribute("listaFoto" , listaFoto);


        return "/foto/gallery";
    }
}

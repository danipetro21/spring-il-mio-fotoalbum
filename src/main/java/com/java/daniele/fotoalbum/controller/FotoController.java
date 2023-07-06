package com.java.daniele.fotoalbum.controller;


import com.java.daniele.fotoalbum.model.Foto;
import com.java.daniele.fotoalbum.repository.CategoriaRepository;
import com.java.daniele.fotoalbum.repository.FotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model){

        Optional<Foto> result = fotoRepository.findById(id);
        if (result.isPresent()) {
            model.addAttribute("foto", result.get());
            return "/foto/detail";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "foto with id " + id + " not found");
        }

    }



}

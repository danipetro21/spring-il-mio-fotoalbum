package com.java.daniele.fotoalbum.controller;


import com.java.daniele.fotoalbum.model.Categoria;
import com.java.daniele.fotoalbum.model.Foto;
import com.java.daniele.fotoalbum.repository.CategoriaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {


    @Autowired
    CategoriaRepository categoriaRepository;


    @GetMapping
    public String list (Model model){
        List<Categoria> listCategoria;

        listCategoria = categoriaRepository.findAll();
        model.addAttribute("listCategoria", listCategoria);
        return "/categoria/list";
    }


    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Categoria categoriaToDelete = getCategoriaById(id);

        for (Foto foto : categoriaToDelete.getListaFoto()) {
            foto.getCategoriaList().remove(categoriaToDelete);
        }

        categoriaRepository.delete(categoriaToDelete);
        return "redirect:/categoria";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("categoria") Categoria formCat) {
        categoriaRepository.save(formCat);
        return "redirect:/categoria";
    }



    private Categoria getCategoriaById(Integer id) {
        Optional<Categoria> result = categoriaRepository.findById(id);
        if (result.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "categoria with id " + id + " not found");
        }
        return result.get();
    }




}

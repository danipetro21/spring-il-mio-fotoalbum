package com.java.daniele.fotoalbum.controller;


import com.java.daniele.fotoalbum.model.Foto;
import com.java.daniele.fotoalbum.repository.CategoriaRepository;
import com.java.daniele.fotoalbum.repository.FotoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
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
    public String listFoto(@RequestParam(name = "keyword", required = false) String searchString, Model model) {
        List<Foto> listaFoto;

        if (searchString == null || searchString.isBlank()) {
            listaFoto = fotoRepository.findAll();
        } else {
            listaFoto = fotoRepository.findByTitleContainingIgnoreCase(searchString);
        }

        model.addAttribute("listaFoto", listaFoto);
        model.addAttribute("searchInput", searchString == null ? "" : searchString);
        return "/foto/gallery";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {

        Optional<Foto> result = fotoRepository.findById(id);
        if (result.isPresent()) {
            model.addAttribute("foto", result.get());
            return "/foto/detail";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "foto with id " + id + " not found");
        }

    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        Foto fotoToDelete = getFotoById(id);
        fotoRepository.delete(fotoToDelete);
        return "redirect:/foto/lista";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("foto", new Foto());
        model.addAttribute("categorie", categoriaRepository.findAll());
        return "/foto/form";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("foto") Foto fotoForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("foto", fotoForm);
            model.addAttribute("categorie", categoriaRepository.findAll());
            return "/foto/form";
        }

        fotoRepository.save(fotoForm);

        return "redirect:/foto/lista";
    }

    /*UTILITY*/

    public Foto getFotoById(Integer id) {
        Optional<Foto> result = fotoRepository.findById(id);
        if (result.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "foto with id " + id + " not found");
        }
        return result.get();
    }

}

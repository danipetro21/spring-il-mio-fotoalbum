package com.java.daniele.fotoalbum.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "title must not be null or blank")
    @Column(nullable = false)
    private String name;


    @ManyToMany(mappedBy = "categoriaList")
    private List<Foto> listaFoto = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Foto> getListaFoto() {
        return listaFoto;
    }

    public void setListaFoto(List<Foto> listaFoto) {
        this.listaFoto = listaFoto;
    }
}

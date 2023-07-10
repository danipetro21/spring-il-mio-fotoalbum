package com.java.daniele.fotoalbum.controller;


import com.java.daniele.fotoalbum.model.Messaggi;
import com.java.daniele.fotoalbum.repository.MessaggiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/messaggi")
public class MessaggiController {

    @Autowired
    private MessaggiRepository messaggiRepository;

    @GetMapping("/lista")
    public String getAllMessage(Model model){

        List<Messaggi> listMessaggi;

        listMessaggi = messaggiRepository.findAll();

        model.addAttribute("listMessaggi", listMessaggi);

        return "/contatti/messaggi";
    }


}

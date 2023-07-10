package com.java.daniele.fotoalbum.api;



import com.java.daniele.fotoalbum.controller.MessaggiController;
import com.java.daniele.fotoalbum.model.Messaggi;
import com.java.daniele.fotoalbum.repository.MessaggiRepository;
import com.java.daniele.fotoalbum.service.MessaggiService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("api/v1/messaggi")
public class MessaggiRestController {

    @Autowired
    private MessaggiRepository messaggiRepository;
    @Autowired
    private MessaggiService messaggiService;


    @PostMapping
    public Messaggi create(@RequestBody Messaggi messaggio) {
        return messaggiService.create(messaggio);
    }

}



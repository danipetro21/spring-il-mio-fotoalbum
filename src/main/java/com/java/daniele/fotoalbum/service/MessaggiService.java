package com.java.daniele.fotoalbum.service;

import com.java.daniele.fotoalbum.model.Messaggi;
import com.java.daniele.fotoalbum.repository.MessaggiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessaggiService {

    @Autowired
    MessaggiRepository messaggiRepository;

    public MessaggiService(MessaggiRepository messaggiRepository){
        this.messaggiRepository = messaggiRepository;
    }

    public Messaggi create(Messaggi messaggio) throws IllegalArgumentException {
        Messaggi messaggioToPersist = new Messaggi();
        messaggioToPersist.setId(messaggio.getId());
        messaggioToPersist.setEmail(messaggio.getEmail());
        messaggioToPersist.setMessage(messaggio.getMessage());
        return messaggiRepository.save(messaggioToPersist);
    }

}

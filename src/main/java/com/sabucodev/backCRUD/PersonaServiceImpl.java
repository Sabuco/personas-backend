package com.sabucodev.backCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona create(Persona p) {
        return personaRepository.save(p);
    }

    @Override
    public Persona getById(int id) {
        return personaRepository.findById(id);
    }

    @Override
    public Persona update(Persona p) {
        return personaRepository.save(p);
    }

    @Override
    public Persona delete(int id) {
        Persona p = getById(id);
        if(p!=null){
            personaRepository.delete(p);
        }
        return p;
    }


}

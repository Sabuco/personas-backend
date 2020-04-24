package com.sabucodev.backCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class Controller {
    @Autowired
    PersonaService personaService;

    @GetMapping
    public List<Persona> getAll(){
        return personaService.getAll();
    }

    @PostMapping
    public Persona create(@RequestBody Persona p){
        return personaService.create(p);
    }

    @GetMapping(path = {"/{id}"})
    public Persona getById(@PathVariable("id") int id){
        return personaService.getById(id);
    }
    @PutMapping(path = {"/{id}"})
    public Persona update(@RequestBody Persona p,@PathVariable("id") int id){
        p.setId(id);
        return personaService.update(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public Persona delete(@PathVariable("id") int  id){
        return personaService.delete(id);
    }
}

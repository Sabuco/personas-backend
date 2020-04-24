package com.sabucodev.backCRUD;

import java.util.List;

public interface PersonaService {
    List<Persona> getAll();
    Persona getById(int id);
    Persona create(Persona p);
    Persona update(Persona p);
    Persona delete(int id);
}

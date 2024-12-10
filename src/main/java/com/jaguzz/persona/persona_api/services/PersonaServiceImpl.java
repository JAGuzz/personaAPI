package com.jaguzz.persona.persona_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jaguzz.persona.persona_api.entities.Persona;
import com.jaguzz.persona.persona_api.repositories.BaseRepository;
import com.jaguzz.persona.persona_api.repositories.PersonaRepository;


@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    
    @Autowired
    private PersonaRepository personaRepository;
    
    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {

            //List<Persona> personas = personaRepository.findByNameContainingOrLastnameContaining(filtro, filtro);
            //List<Persona> personas = personaRepository.search(filtro);
            List<Persona> personas = personaRepository.search2(filtro);
            return personas;

        } catch (Exception e) {
           throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {

            //Page<Persona> personas = personaRepository.findByNameContainingOrLastnameContaining(filtro, filtro, pageable);
            //Page<Persona> personas = personaRepository.search(filtro, pageable);
            Page<Persona> personas = personaRepository.search2(filtro, pageable);
            return personas;

        } catch (Exception e) {
           throw new Exception(e.getMessage());
        }
    }

}
/*
 * Interface de PersonaServiceImpl
 * extiende de BaseServiceImpl pasando por algumento la entidad Persona y el Id
 * para asi tambien acceder a los metodos CRUD declarados en BaseServiceImpl
 * se crea una instancia de personaRepository ya que el baseRepository esta declarado
 * como "protected" por lo que no se pueden aceder a la informacion mediante ese repo
 * pero al tener intanciado personaRepository que hereda/extiende de baseRepo
 * es posible acceder a la informacion
 */

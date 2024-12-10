package com.jaguzz.persona.persona_api.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaguzz.persona.persona_api.entities.Persona;

public interface PersonaService extends BaseService<Persona, Long>{

    List<Persona> search(String filtro) throws Exception;

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;

}
/*
 * Interface de PersonaService sera util para el llamado de querys
 * extiende de BaseService pasando por algumento la entidad Persona y el Id
 * para asi tambien acceder a los metodos CRUD declarados en BaseService
 */
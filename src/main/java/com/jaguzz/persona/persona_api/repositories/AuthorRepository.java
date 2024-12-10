package com.jaguzz.persona.persona_api.repositories;

import org.springframework.stereotype.Repository;

import com.jaguzz.persona.persona_api.entities.Author;

@Repository
public interface AuthorRepository extends BaseRepository<Author, Long> {

}
// Creacion del repository para Autor extendiendo de BaseRepository y pasando por argumento la entidad y Id
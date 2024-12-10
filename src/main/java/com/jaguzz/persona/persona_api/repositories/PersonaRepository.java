package com.jaguzz.persona.persona_api.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jaguzz.persona.persona_api.entities.Persona;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    List<Persona> findByNameContainingOrLastnameContaining(String name, String lastname);

    @Query(value = "SELECT p FROM Persona p WHERE p.name LIKE %:filtro% OR p.lastname LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);


    @Query(
        value = "SELECT * FROM persona WHERE persona.name LIKE %:filtro% OR persona.last_name LIKE %:filtro%",
        nativeQuery = true
    )
    List<Persona> search2(@Param("filtro") String filtro);



    //implementando paginacion

    Page<Persona> findByNameContainingOrLastnameContaining(String name, String lastname, Pageable pageable);

    @Query(value = "SELECT p FROM Persona p WHERE p.name LIKE %:filtro% OR p.lastname LIKE %:filtro%")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);


    @Query(
        value = "SELECT * FROM persona WHERE persona.name LIKE %:filtro% OR persona.last_name LIKE %:filtro%",
        countQuery = "SELECT count(*) FROM persona",
        nativeQuery = true
    )
    Page<Persona> search2(@Param("filtro") String filtro, Pageable pageable);

}
// Creacion del repository para Persona extendiendo de BaseRepository y pasando por argumento la entidad y Id
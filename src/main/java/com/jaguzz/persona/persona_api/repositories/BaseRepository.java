package com.jaguzz.persona.persona_api.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.jaguzz.persona.persona_api.entities.Base;


//SE CREA LA INTERFACE REPOSITORY BASE PASANDOLE POR ARGUMENTO UN ENTITY QUE DEBE EXTENDER DE LA CLASE "Base" Y EL ID
@NoRepositoryBean
public interface BaseRepository <E extends Base , ID extends Serializable> extends JpaRepository<E, ID>{

}

package com.jaguzz.persona.persona_api.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaguzz.persona.persona_api.entities.Base;

public interface BaseService<E extends Base, ID extends Serializable> {

    public List<E> findAll() throws Exception;

    public Page<E> findAll(Pageable pageable) throws Exception;

    public E findById(ID id) throws Exception;

    public E save(E entity) throws Exception;

    public E update(ID id, E entity) throws Exception;

    public boolean delete(ID id) throws Exception;

}
/*
 * Creacion del blueprint del servicio base, este tiene como requisito que le pasen por argumento
 * un Entity que extienda de Base y un Id que extienda de Serializable
 */

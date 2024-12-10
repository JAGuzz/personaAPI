package com.jaguzz.persona.persona_api.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jaguzz.persona.persona_api.entities.Base;
import com.jaguzz.persona.persona_api.repositories.BaseRepository;

import jakarta.transaction.Transactional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository){
        this.baseRepository = baseRepository;
        
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {

            List<E> entities = baseRepository.findAll();
            return entities;

        
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception {
        try {

            Page<E> entities = baseRepository.findAll(pageable);
            return entities;

        
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
            
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate = baseRepository.save(entity);
            return entityUpdate;
            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }


    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if(baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }
            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return false;
    }

}
/*
 * Creacion del servicio base, aqui esta implementada toda la logica necesaria para las consultas CRUD
 * este servicio base tiene como requisito que le pasen por argumento
 * un Entity que extienda de Base y un Id que extienda de Serializable
 */

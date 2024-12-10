package com.jaguzz.persona.persona_api.services;

import org.springframework.stereotype.Service;

import com.jaguzz.persona.persona_api.entities.Locality;
import com.jaguzz.persona.persona_api.repositories.BaseRepository;

@Service
public class LocalityServiceImpl extends BaseServiceImpl<Locality, Long> implements LocalityService{

    public LocalityServiceImpl(BaseRepository<Locality, Long> baseRepository){
        super(baseRepository);
    }
}

package com.jaguzz.persona.persona_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaguzz.persona.persona_api.entities.Author;
import com.jaguzz.persona.persona_api.repositories.AuthorRepository;
import com.jaguzz.persona.persona_api.repositories.BaseRepository;

@Service
public class AuthorServiceImpl extends BaseServiceImpl<Author, Long> implements AutorService {

    @SuppressWarnings("unused")
    @Autowired
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(BaseRepository<Author, Long> baseRepository){
        super(baseRepository);
    }

}

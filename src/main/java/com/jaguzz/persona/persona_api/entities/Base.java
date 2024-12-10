package com.jaguzz.persona.persona_api.entities;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Base implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}

/*
 * CREACION DE LA CLASE BASE CON EL ATRIBUTO ID PARA QUE ASI EL ID PARA CADA ENTIDAD QUE LA EXTIENDA SEA EL MISMO
 */

package com.jaguzz.persona.persona_api.entities;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "author")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Author extends Base {

    @Column(name="name")
    private String name;

    @Column(name="lastname")
    private String lastname;

    @Column(name="biography", length = 1500)
    private String biography;


}

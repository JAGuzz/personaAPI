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
@Table(name="locality")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Locality extends Base{

    @Column(name="denomination")
    private String denomination;
}

package com.jaguzz.persona.persona_api.entities;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="domicile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Domicile extends Base {

    @Column(name="street")
    private String street;

    @Column(name="number")
    private String number;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_locality")
    private Locality locality;

}

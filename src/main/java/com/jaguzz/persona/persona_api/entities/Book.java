package com.jaguzz.persona.persona_api.entities;

import java.util.List;

import org.hibernate.envers.Audited;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Book extends Base{

    @Column(name="title")
    private String title;

    @Column(name="date")
    private int date;

    @Column(name="gender")
    private String gender;

    @Column(name = "pages")
    private int pages;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Author> authors;

}

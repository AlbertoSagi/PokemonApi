package com.api.pokemon.restful.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table
public class Pokemon {

    @Id
    @GeneratedValue
    Integer id;

    @Column(name = "name")
    private String name;

    @Column (name="type")
    private String type;

    @Column (name="experience")
    private Integer experience;

    @Column (name="height")
    private Integer height;

    @Column (name="weight")
    private Integer weight;

}

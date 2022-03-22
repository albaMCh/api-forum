package com.example.apiforum.Clases;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "pregunta")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String title;

    @Column
    private  String description;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private  Users owner;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL)
    private List<Respuesta> respuestas;

    @Column
    private  String view;

    @Column
    private String tags;
}

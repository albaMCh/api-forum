package com.example.apiforum.Clases;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="respuesta")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "pregunta_id")
    private Pregunta pregunta;

    @Column
    private String visitas;

    @Column
    private String tags;

    @OneToMany(mappedBy = "respuesta", fetch = FetchType.LAZY)= "respuestas_id"))
    private List<Respuesta> respuestas;
    @JoinTable(name = "respuesta", joinColumns = @JoinColumn(name

}
package com.example.apiforum.Clases;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "tags")
public class Etiqueta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToMany( fetch = FetchType.LAZY)
    @JoinTable(name = "Tag to preguntas", joinColumns = @JoinColumn(name = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"tag_id", "preguntas_id"})})
    private List <Etiqueta> tag;

}







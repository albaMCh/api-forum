package com.example.apiforum.Clases;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "modulo")




public class Modulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String Description;

    @Column (name="visitas")
    private String Visitas;

    @Column (name = "tag")
    private String Tag;

    @OneToMany( mappedBy = "module", fetch = FetchType.LAZY)
    @JoinTable(name = "module", joinColumns = @JoinColumn(name = "module_id"),
            inverseJoinColumns = @JoinColumn(name ="module_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"module_id", "questions_id"})})
    private List<Modulo> modulos;


}

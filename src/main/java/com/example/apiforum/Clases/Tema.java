package com.example.apiforum.Clases;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "temas")

public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String titulo;

    @Column
    private String Descripcion;
    
    @Column
    private String visitas;
    
    @Column
    private String Tag;

    @OneToMany( mappedBy ="Temas", fetch = FetchType.LAZY,
                cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "temas_id")
    private List<Tema> temas;
}

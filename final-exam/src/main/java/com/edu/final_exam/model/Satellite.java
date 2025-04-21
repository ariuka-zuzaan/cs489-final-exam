package com.edu.final_exam.model;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name = "satellites")
@AllArgsConstructor
@Data

public class Satellite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long satelliteId;

    @NotBlank(message = "Astronaut first name is required and cannot be null or empty string or blank spaces")
    @Column(unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private OrbitType orbitType;

    @Past(message="Launch Date must be passed")
    private LocalDate launchDate;

    private Boolean decommissioned;

    @ManyToMany(mappedBy = "satellites")
    private List<Astronaut> astronauts;

    public Satellite(String name, LocalDate launchDate, Boolean decommissioned, List<Astronaut> astronauts){
        this.name = name;
        this.launchDate = launchDate;
        this.decommissioned = decommissioned;

    }

    
}

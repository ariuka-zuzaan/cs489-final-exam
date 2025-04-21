package com.edu.final_exam.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name = "astronauts")
@AllArgsConstructor
@Data

public class Astronaut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long astronautId;

    @NotBlank(message = "Astronaut first name is required and cannot be null or empty string or blank spaces")
    @Size(min=0, max=20)
    private String firstName;
   
    @NotBlank(message = "Astronaut last name is required and cannot be null or empty string or blank spaces")
    @Size(min=0, max=20)
    private String lastName;
    
    @Column
    @Min(0)
    @Max(50)
    private Integer experienceYears;

    @ManyToMany
    @JoinTable(
        name = "astronaut_satellite",
        joinColumns = @JoinColumn(name = "astronaut_id"),
        inverseJoinColumns = @JoinColumn(name = "satellite_id")
    )
    private List<Satellite> satellites;
    
    public Astronaut( String firstName,  String lastName, Integer experienceYears){
        this.firstName=firstName;
        this.lastName=lastName;
        this.experienceYears = experienceYears;

    }
}

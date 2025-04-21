package com.edu.final_exam.dto.response;

import java.util.List;

import com.edu.final_exam.model.Satellite;

public record AstronautResponseDTO(
    Long astronautId,
    String firstName,
    String lastName,
    Integer experienceYears,
    List<Satellite> satellites
    ){

}

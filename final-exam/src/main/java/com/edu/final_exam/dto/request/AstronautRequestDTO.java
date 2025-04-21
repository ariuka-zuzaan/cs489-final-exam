package com.edu.final_exam.dto.request;

import java.util.List;

import com.edu.final_exam.model.Satellite;

public record AstronautRequestDTO(
    String firstName,
    String lastName,
    Integer experienceYears,
    List<Satellite> satellites
  
) {

    public Iterable<Long> satelliteIds() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'satelliteIds'");
    }
    
}

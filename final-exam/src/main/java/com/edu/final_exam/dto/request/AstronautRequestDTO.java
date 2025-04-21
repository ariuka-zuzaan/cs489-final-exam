package com.edu.final_exam.dto.request;

import java.util.List;

public record AstronautRequestDTO(
    String firstName,
    String lastName,
    Integer experienceYears,
    List<Long> satelliteIds
  
) {
    
}

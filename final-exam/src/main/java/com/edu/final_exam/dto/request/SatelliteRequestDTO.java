package com.edu.final_exam.dto.request;

import java.time.LocalDate;

import com.edu.final_exam.model.OrbitType;

public record SatelliteRequestDTO(
    String name,
    OrbitType orbitType,
    LocalDate launchDate,
    Boolean decommissioned
    
) {
    
}

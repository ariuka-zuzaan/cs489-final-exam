package com.edu.final_exam.dto.response;

import java.time.LocalDate;

import com.edu.final_exam.model.OrbitType;

public record SatelliteResponseDTO(
    Long satelliteId,
    String name,
    OrbitType orbitType,
    LocalDate launchDate,
    Boolean decommissioned
) {
    
}

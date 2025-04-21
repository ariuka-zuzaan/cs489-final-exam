package com.edu.final_exam.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.edu.final_exam.dto.response.AstronautResponseDTO;
import com.edu.final_exam.dto.response.SatelliteResponseDTO;
import com.edu.final_exam.model.Astronaut;
import com.edu.final_exam.model.Satellite;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AstronautMapper {
    @Mapping(target = "astronautId", ignore = true)
    @Mapping(target = "satellites", ignore = true) // manually set courses
    Astronaut AstronautToResponseDTO(AstronautResponseDTO astronautResponseDTO);
    
    @Mapping(target = "satellites", source = "satellites")
    AstronautResponseDTO astronautToResponseDTO(Astronaut astronaut);

    SatelliteResponseDTO satelliteToResponseDTO(Satellite satellite);
}



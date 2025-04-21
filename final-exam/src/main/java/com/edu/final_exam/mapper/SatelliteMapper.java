package com.edu.final_exam.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.edu.final_exam.dto.request.SatelliteRequestDTO;
import com.edu.final_exam.dto.response.AstronautResponseDTO;
import com.edu.final_exam.model.Astronaut;
import com.edu.final_exam.model.Satellite;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SatelliteMapper {
    @Mapping(target = "astronaut", source = "satellite")
    SatelliteRequestDTO satelliteToSatelliteRequestDTO(Satellite satellite);

    AstronautResponseDTO astronautToAstronautResponseDTO(Astronaut astronaut);
}

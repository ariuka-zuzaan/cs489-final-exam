package com.edu.final_exam.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.final_exam.dto.request.AstronautRequestDTO;
import com.edu.final_exam.dto.response.AstronautResponseDTO;
import com.edu.final_exam.mapper.AstronautMapper;
import com.edu.final_exam.model.Astronaut;
import com.edu.final_exam.model.Satellite;
import com.edu.final_exam.repositery.AstronutRepositery;
import com.edu.final_exam.repositery.SatelliteRepositery;
import com.edu.final_exam.service.AstronautService;

@Service
public class AstronautServiceImpl implements AstronautService {

    private final SatelliteRepositery satelliteRepositery;
    private final AstronutRepositery astronutRepositery;
    private final AstronautMapper astronautMapper;

    public AstronautServiceImpl( SatelliteRepositery satelliteRepositery,AstronutRepositery astronutRepositery, AstronautMapper astronautMapper){
        this.satelliteRepositery = satelliteRepositery;
        this.astronutRepositery = astronutRepositery;
        this.astronautMapper = astronautMapper;
    }

    public AstronautResponseDTO createAstronaut(AstronautRequestDTO dto) {
    List<Satellite> satellites = new ArrayList<>(satelliteRepositery.findAllById(dto.satelliteIds()));

        // validate all IDs are found
        if (satellites.size() != dto.satelliteIds().size()) {
            throw new IllegalArgumentException("One or more satellite IDs are invalid");
        }

        Astronaut astronaut = astronautMapper.astronautRequestToAstronaut(dto);
        astronaut.setSatellites(satellites);

        astronutRepositery.save(astronaut);
        return astronautMapper.astronautToResponseDTO(astronaut);
    }
}

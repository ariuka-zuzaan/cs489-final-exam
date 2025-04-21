package com.edu.final_exam.service;

import org.springframework.stereotype.Service;

import com.edu.final_exam.dto.request.AstronautRequestDTO;
import com.edu.final_exam.dto.response.AstronautResponseDTO;

public interface AstronautService {
    AstronautResponseDTO createAstronaut(AstronautRequestDTO requestDTO);
}

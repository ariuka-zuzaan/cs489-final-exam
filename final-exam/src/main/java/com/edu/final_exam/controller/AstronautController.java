package com.edu.final_exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.final_exam.dto.request.AstronautRequestDTO;
import com.edu.final_exam.dto.response.AstronautResponseDTO;
import com.edu.final_exam.service.AstronautService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value="/api/v1/astronauts")
public class AstronautController {

    private final AstronautService astronautService;

    public AstronautController(AstronautService astronautService) {
        this.astronautService = astronautService;
    }

    // @GetMapping
    // public ResponseEntity<List<AstronautResponseDTO>> listAddress() {
    //     return ResponseEntity.ok(astronautService.getAlls());
    // }

    @PostMapping
    public ResponseEntity<AstronautResponseDTO> registerNewAstronaut(@Valid @RequestBody AstronautRequestDTO astronautRequestDTO) {
        return new ResponseEntity<>(astronautService.createAstronaut(astronautRequestDTO), HttpStatus.CREATED);
    }

    
}

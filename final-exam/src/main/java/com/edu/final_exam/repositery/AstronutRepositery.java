package com.edu.final_exam.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.edu.final_exam.model.Astronaut;

@Repository
public interface AstronutRepositery extends JpaRepository<Astronaut, Long>{

}

package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Professor;
import com.example.demo.repositories.ProfessorRepository;

@Service
public class ProfessorService {
	
	 @Autowired
	    private ProfessorRepository professorRepository;

	public void cadastrarProfessor(Professor professor) {
		professorRepository.save(professor);		
	}

}

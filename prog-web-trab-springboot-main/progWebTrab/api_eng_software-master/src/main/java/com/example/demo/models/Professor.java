package com.example.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Professor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
    private Long id;
	
    private String matricula;
    private String nomeCompleto;
    private String email;
    private int anoEgresso;
    
    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

   

    public Professor() {
    }

    public Professor(String matricula, String nomeCompleto, String email, int anoEgresso) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.anoEgresso = anoEgresso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoEgresso() {
        return anoEgresso;
    }

    public void setAnoEgresso(int anoEgresso) {
        this.anoEgresso = anoEgresso;
    }
 
    
    

}

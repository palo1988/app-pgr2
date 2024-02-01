package com.spring.primeraweb;

import com.spring.primeraweb.entities.Persona;
import com.spring.primeraweb.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication  {
    @Autowired
    public PersonaRepository personaRepository;

    public static void main(String[] args) {

        SpringApplication.run(PrimeraWebSpringbootApplication.class, args);

    }
/*
    @Override
    public void run(String... args) throws Exception {
        personaRepository.save(new Persona(5l, "Carolina", 35));
        personaRepository.save(new Persona(6l, "Gabriela", 33));
        personaRepository.save(new Persona(7l, "Carlos", 28));
        personaRepository.save(new Persona(8l, "David", 26));
        System.out.println("numero de personas en la tabla: " + personaRepository.count());
        List<Persona> personas = personaRepository.findAll();
        personas.forEach(p -> System.out.println("nombre de la persona: " + p.getNombre()));
    }*/


}

package com.example.proyectoliz.repository;

import com.example.proyectoliz.repository.model.FichaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFichaMedicaRepo extends JpaRepository <FichaMedica, Integer> {


}

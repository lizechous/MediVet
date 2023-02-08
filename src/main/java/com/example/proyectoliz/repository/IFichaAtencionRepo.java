package com.example.proyectoliz.repository;

import com.example.proyectoliz.repository.model.FichaAtencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFichaAtencionRepo extends JpaRepository <FichaAtencion, Integer>{
}

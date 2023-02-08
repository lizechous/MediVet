package com.example.proyectoliz.repository;

import com.example.proyectoliz.repository.model.MedicoVet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicoVetRepo extends JpaRepository <MedicoVet, Integer> {
}

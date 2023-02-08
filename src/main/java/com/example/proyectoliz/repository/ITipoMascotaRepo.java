package com.example.proyectoliz.repository;

import com.example.proyectoliz.repository.model.TipoMascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoMascotaRepo extends JpaRepository <TipoMascota, Integer> {
}

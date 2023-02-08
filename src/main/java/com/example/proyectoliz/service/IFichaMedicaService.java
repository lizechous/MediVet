package com.example.proyectoliz.service;

import com.example.proyectoliz.repository.model.FichaMedica;

import java.util.List;

public interface IFichaMedicaService {

    //Crear Ficha Medica
    Boolean saveFichaMedica(FichaMedica fichaMedica);

    //Listar todas fichas medicas
    public List<FichaMedica> findAllFichasMedicas();
}

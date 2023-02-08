package com.example.proyectoliz.service;

import com.example.proyectoliz.repository.IFichaMedicaRepo;
import com.example.proyectoliz.repository.model.FichaMedica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //Con esto le indicamos que pertenece a la capa servicio
public class FichaMedicaImpl implements IFichaMedicaService{

    //Con @Autowired llamamos a la instancia de FichaMedicaRepo
    @Autowired
    //De esta manera conectamos la capa service con repository
    private IFichaMedicaRepo fichaMedicaRepo;


    @Override
    public Boolean saveFichaMedica(FichaMedica fichaMedica) {
        fichaMedicaRepo.save(fichaMedica);
        return true;
    }

    @Override
    public List<FichaMedica> findAllFichasMedicas() {
        return fichaMedicaRepo.findAll();
    }
}

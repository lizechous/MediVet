package com.example.proyectoliz.service;

import com.example.proyectoliz.repository.IFichaAtencionRepo;
import com.example.proyectoliz.repository.model.FichaAtencion;
import com.example.proyectoliz.repository.model.FichaMedica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FichaAtencionImpl implements IFichaAtencionService{

    @Autowired
    IFichaAtencionRepo fichaAtencionRepo;

    @Override
    public Boolean crearFichaAtencion(FichaAtencion fichaAtencion) {
        FichaMedica fichaMedicaExistente = new FichaMedica();
        fichaMedicaExistente.setIdFichaMedica(fichaAtencion.getIdFichaMedica());
        fichaAtencion.setFichaMedica(fichaMedicaExistente);

        fichaAtencionRepo.save(fichaAtencion);
        return true;
    }
}

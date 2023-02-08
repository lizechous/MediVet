package com.example.proyectoliz.controller;

import com.example.proyectoliz.repository.model.FichaMedica;
import com.example.proyectoliz.service.IFichaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ficha-medica")
public class FichaMedicaController {

    @Autowired
    private IFichaMedicaService fichaMedicaService;

    @RequestMapping(value = "/save-ficha-medica", method = RequestMethod.POST) //ruta del servicio
    public ResponseEntity<Boolean> saveFichaMedica(@RequestBody FichaMedica fichaMedica) throws Exception {
        try{
            return new ResponseEntity<>(fichaMedicaService.saveFichaMedica(fichaMedica), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/find-all-fichas-medicas", method = RequestMethod.GET)
    public ResponseEntity<List> findAllFichasMedicas() {
        return new ResponseEntity<>(fichaMedicaService.findAllFichasMedicas(), HttpStatus.ACCEPTED);
    }
}

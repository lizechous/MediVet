package com.example.proyectoliz.controller;

import com.example.proyectoliz.repository.model.FichaAtencion;
import com.example.proyectoliz.repository.model.FichaMedica;
import com.example.proyectoliz.service.IFichaAtencionService;
import com.example.proyectoliz.service.IFichaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ficha-atencion")
public class FichaAtencionController {

    @Autowired
    private IFichaAtencionService fichaAtencionService;

    @RequestMapping(value = "/save-ficha-atencion", method = RequestMethod.POST)
    public ResponseEntity<Boolean> crearFichaAtencion(@RequestBody FichaAtencion fichaAtencion) throws Exception {
        try{
            return new ResponseEntity<>(fichaAtencionService.crearFichaAtencion(fichaAtencion), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}

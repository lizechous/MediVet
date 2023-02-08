package com.example.proyectoliz.repository.model;

import javax.persistence.*;

@Entity
public class TipoMascota {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_mascota")
    private Integer idTipoMascota;

    @Column(name = "nombre_tipo", nullable = false)
    private String nombreTipo;

    public TipoMascota(Integer idTipoMascota, String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Integer getIdTipoMascota() {
        return idTipoMascota;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }




}

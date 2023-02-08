package com.example.proyectoliz.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class FichaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ficha_medica", nullable = false)
    private Integer idFichaMedica;

    @Column(name = "fecha_ingreso", nullable = false)
    private Date fechaIngreso;

    @Column(name = "nombre_mascota", nullable = false, length = 30)
    private String nombreMascota;

    @Column(name = "edad_anios", nullable = false)
    private Integer edadAnios;

    @Column(nullable = false)
    private String raza;

    @Column(name = "tipo_mascota", nullable = false)
    private String tipoMascota;

    @OneToMany(mappedBy="fichaMedica", cascade = CascadeType.ALL)
    private List<FichaAtencion> fichaAtencionList;

    public Integer getIdFichaMedica() {
        return idFichaMedica;
    }

    public void setIdFichaMedica(Integer idFichaMedica) {
        this.idFichaMedica = idFichaMedica;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Integer getEdadAnios() {
        return edadAnios;
    }

    public void setEdadAnios(Integer edadAnios) {
        this.edadAnios = edadAnios;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public List<FichaAtencion> getFichaAtencionList() {
        return fichaAtencionList;
    }

    public void setFichaAtencionList(List<FichaAtencion> fichaAtencionList) {
        this.fichaAtencionList = fichaAtencionList;
    }
}

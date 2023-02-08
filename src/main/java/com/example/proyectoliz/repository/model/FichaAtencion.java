package com.example.proyectoliz.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;

@Entity
public class FichaAtencion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ficha_atencion")
    private Integer idFichaAtencion;

    @Column(name = "fecha_atencion", nullable = false)
    private Date fechaAtencion;

    @Column(name = "motivo_consulta", nullable = false)
    private String motivoConsulta;

    @Column
    private String observaciones;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_ficha_medica_fk")
    private FichaMedica fichaMedica;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_medico_fk")
    private MedicoVet medicoVet;

    //Para que no tome este atributo en el modelo db
    @Transient
    private Integer idFichaMedica;


    public Integer getIdFichaAtencion() {
        return idFichaAtencion;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public FichaMedica getFichaMedica() {
        return fichaMedica;
    }

    public void setFichaMedica(FichaMedica fichaMedica) {
        this.fichaMedica = fichaMedica;
    }

    public MedicoVet getMedicoVet() {
        return medicoVet;
    }

    public void setMedicoVet(MedicoVet medicoVet) {
        this.medicoVet = medicoVet;
    }

    public Integer getIdFichaMedica() {
        return idFichaMedica;
    }

    public void setIdFichaMedica(Integer idFichaMedica) {
        this.idFichaMedica = idFichaMedica;
    }
}

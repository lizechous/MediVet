package com.example.proyectoliz.repository.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class MedicoVet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_medico", nullable = false)
    private Integer idMedico;

    @Column(name = "nombre_medico", nullable = false)
    private String nombreMedico;

    @Column(name = "email_medico", nullable = false, length = 50)
    private String emailMedico;

    @OneToMany(mappedBy = "medicoVet", cascade = CascadeType.ALL)
    private List<FichaAtencion> fichaAtencionList;

    public MedicoVet(String nombreMedico, String emailMedico, List<FichaAtencion> fichaAtencionList) {
        this.nombreMedico = nombreMedico;
        this.emailMedico = emailMedico;
        this.fichaAtencionList = fichaAtencionList;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getEmailMedico() {
        return emailMedico;
    }

    public void setEmailMedico(String emailMedico) {
        this.emailMedico = emailMedico;
    }

    public List<FichaAtencion> getFichaAtencionList() {
        return fichaAtencionList;
    }

    public void setFichaAtencionList(List<FichaAtencion> fichaAtencionList) {
        this.fichaAtencionList = fichaAtencionList;
    }
}

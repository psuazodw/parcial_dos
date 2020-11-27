/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial_dos.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pablo Suazo
 */
@Entity
@Table(name = "moto_marca")
public class motoMarca {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mar_id")
    private Integer marId;

    @Column(name = "mar_marca")
    private String marMarca;
    
    @Column(name = "mar_color")
    private String marColor;
    
    @Column(name = "mar_modelo")
    private String marModelo;

    @Column(name = "mar_existencia")
    private Integer marExistencia;
    
    @Column(name = "mar_creado")
    private Date marCreado;
    
    @JsonIgnore
    @OneToMany(mappedBy = "motMarca")
    private Set<motoMotocicleta> motocicletaList;

    /**
     * @return the marId
     */
    public Integer getMarId() {
        return marId;
    }

    /**
     * @param marId the marId to set
     */
    public void setMarId(Integer marId) {
        this.marId = marId;
    }

    /**
     * @return the marMarca
     */
    public String getMarMarca() {
        return marMarca;
    }

    /**
     * @param marMarca the marMarca to set
     */
    public void setMarMarca(String marMarca) {
        this.marMarca = marMarca;
    }

    /**
     * @return the marColor
     */
    public String getMarColor() {
        return marColor;
    }

    /**
     * @param marColor the marColor to set
     */
    public void setMarColor(String marColor) {
        this.marColor = marColor;
    }

    /**
     * @return the marModelo
     */
    public String getMarModelo() {
        return marModelo;
    }

    /**
     * @param marModelo the marModelo to set
     */
    public void setMarModelo(String marModelo) {
        this.marModelo = marModelo;
    }

    /**
     * @return the marExistencia
     */
    public Integer getMarExistencia() {
        return marExistencia;
    }

    /**
     * @param marExistencia the marExistencia to set
     */
    public void setMarExistencia(Integer marExistencia) {
        this.marExistencia = marExistencia;
    }

    /**
     * @return the marCreado
     */
    public Date getMarCreado() {
        return marCreado;
    }

    /**
     * @param marCreado the marCreado to set
     */
    public void setMarCreado(Date marCreado) {
        this.marCreado = marCreado;
    }

    /**
     * @return the motocicletaList
     */
    public Set<motoMotocicleta> getMotocicletaList() {
        return motocicletaList;
    }

    /**
     * @param motocicletaList the motocicletaList to set
     */
    public void setMotocicletaList(Set<motoMotocicleta> motocicletaList) {
        this.motocicletaList = motocicletaList;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.getMarId());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final motoMarca other = (motoMarca) obj;
        return Objects.equals(this.getMarId(), other.getMarId());
    }
}

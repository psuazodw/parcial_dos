/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial_dos.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

/**
 *
 * @author Pablo Suazo
 */
@Entity
@Table(name = "moto_cliente")
public class motoCliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliId")
    private Integer cliId;

    @Column(name = "cli_nit")
    private Integer cliNit;
    
    @Column(name = "cli_nombre")
    private String cliNombre;
    
    @Column(name = "cli_apellido")
    private String cliApellido;

    @Column(name = "cli_direccion")
    private String cliDireccion;
    
    @Column(name = "cli_creado")
    private Date cliCreado;

    @JsonIgnore
    @OneToMany(mappedBy = "motCliente")
    private Set<motoMotocicleta> motocicletaList;
    
    /**
     * @return the cliId
     */
    public Integer getCliId() {
        return cliId;
    }

    /**
     * @param cliId the cliId to set
     */
    public void setCliId(Integer cliId) {
        this.cliId = cliId;
    }

    /**
     * @return the cliNit
     */
    public Integer getCliNit() {
        return cliNit;
    }

    /**
     * @param cliNit the cliNit to set
     */
    public void setCliNit(Integer cliNit) {
        this.cliNit = cliNit;
    }

    /**
     * @return the cliNombre
     */
    public String getCliNombre() {
        return cliNombre;
    }

    /**
     * @param cliNombre the cliNombre to set
     */
    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    /**
     * @return the cliApellido
     */
    public String getCliApellido() {
        return cliApellido;
    }

    /**
     * @param cliApellido the cliApellido to set
     */
    public void setCliApellido(String cliApellido) {
        this.cliApellido = cliApellido;
    }

    /**
     * @return the cliDireccion
     */
    public String getCliDireccion() {
        return cliDireccion;
    }

    /**
     * @param cliDireccion the cliDireccion to set
     */
    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    /**
     * @return the cliCreado
     */
    public Date getCliCreado() {
        return cliCreado;
    }

    /**
     * @param cliCreado the cliCreado to set
     */
    public void setCliCreado(Date cliCreado) {
        this.cliCreado = cliCreado;
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
        hash = 47 * hash + Objects.hashCode(this.getCliId());
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
        final motoCliente other = (motoCliente) obj;
        return Objects.equals(this.getCliId(), other.getCliId());
    }

}

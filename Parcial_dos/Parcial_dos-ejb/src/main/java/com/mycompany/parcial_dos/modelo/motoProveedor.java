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
@Table(name = "moto_proveedor")
public class motoProveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id")
    private Integer proId;

    @Column(name = "pro_nit")
    private Integer proNit;
    
    @Column(name = "pro_nombre")
    private String proNombre;
    
    @Column(name = "pro_direccion")
    private String proDireccion;
    
    @Column(name = "pro_creado")
    private Date proCreado;
    
    @JsonIgnore
    @OneToMany(mappedBy = "motProveedor")
    private Set<motoMotocicleta> proveedorList;

    /**
     * @return the proId
     */
    public Integer getProId() {
        return proId;
    }

    /**
     * @param proId the proId to set
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * @return the proNit
     */
    public Integer getProNit() {
        return proNit;
    }

    /**
     * @param proNit the proNit to set
     */
    public void setProNit(Integer proNit) {
        this.proNit = proNit;
    }

    /**
     * @return the proNombre
     */
    public String getProNombre() {
        return proNombre;
    }

    /**
     * @param proNombre the proNombre to set
     */
    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    /**
     * @return the proDireccion
     */
    public String getProDireccion() {
        return proDireccion;
    }

    /**
     * @param proDireccion the proDireccion to set
     */
    public void setProDireccion(String proDireccion) {
        this.proDireccion = proDireccion;
    }

    /**
     * @return the proCreado
     */
    public Date getProCreado() {
        return proCreado;
    }

    /**
     * @param proCreado the proCreado to set
     */
    public void setProCreado(Date proCreado) {
        this.proCreado = proCreado;
    }

    /**
     * @return the proveedorList
     */
    public Set<motoMotocicleta> getProveedorList() {
        return proveedorList;
    }

    /**
     * @param proveedorList the proveedorList to set
     */
    public void setProveedorList(Set<motoMotocicleta> proveedorList) {
        this.proveedorList = proveedorList;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.getProId());
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
        final motoProveedor other = (motoProveedor) obj;
        return Objects.equals(this.getProId(), other.getProId());
    }
    
}

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Pablo Suazo
 */
@Entity
@Table(name = "moto_motocicleta")
public class motoMotocicleta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mot_id")
    private Integer motId;
    
    @Column(name = "mot_cli_id")
    private Integer motCliId;
    
    @Column(name = "mot_mar_id")
    private Integer motMarId;
    
    @Column(name = "mot_pro_id")
    private Integer motProId;
    
    @Column(name = "mot_cantidad")
    private Integer motCantidad;
    
    @Column(name = "mot_creado")
    private Date motCreado;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mot_cli_id", referencedColumnName = "cliId", insertable = false, updatable = false)
    private motoCliente motCliente;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mot_mar_id", referencedColumnName = "mar_Id", insertable = false, updatable = false)
    private motoMarca motMarca;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mot_pro_id", referencedColumnName = "pro_Id", insertable = false, updatable = false)
    private motoProveedor motProveedor;

    /**
     * @return the motId
     */
    public Integer getMotId() {
        return motId;
    }

    /**
     * @param motId the motId to set
     */
    public void setMotId(Integer motId) {
        this.motId = motId;
    }

    /**
     * @return the motCliId
     */
    public Integer getMotCliId() {
        return motCliId;
    }

    /**
     * @param motCliId the motCliId to set
     */
    public void setMotCliId(Integer motCliId) {
        this.motCliId = motCliId;
    }

    /**
     * @return the motMarId
     */
    public Integer getMotMarId() {
        return motMarId;
    }

    /**
     * @param motMarId the motMarId to set
     */
    public void setMotMarId(Integer motMarId) {
        this.motMarId = motMarId;
    }

    /**
     * @return the motProId
     */
    public Integer getMotProId() {
        return motProId;
    }

    /**
     * @param motProId the motProId to set
     */
    public void setMotProId(Integer motProId) {
        this.motProId = motProId;
    }

    /**
     * @return the motCantidad
     */
    public Integer getMotCantidad() {
        return motCantidad;
    }

    /**
     * @param motCantidad the motCantidad to set
     */
    public void setMotCantidad(Integer motCantidad) {
        this.motCantidad = motCantidad;
    }

    /**
     * @return the motCreado
     */
    public Date getMotCreado() {
        return motCreado;
    }

    /**
     * @param motCreado the motCreado to set
     */
    public void setMotCreado(Date motCreado) {
        this.motCreado = motCreado;
    }

    /**
     * @return the motCliente
     */
    public motoCliente getMotCliente() {
        return motCliente;
    }

    /**
     * @param motCliente the motCliente to set
     */
    public void setMotCliente(motoCliente motCliente) {
        this.motCliente = motCliente;
    }

    /**
     * @return the motMarca
     */
    public motoMarca getMotMarca() {
        return motMarca;
    }

    /**
     * @param motMarca the motMarca to set
     */
    public void setMotMarca(motoMarca motMarca) {
        this.motMarca = motMarca;
    }

    /**
     * @return the motProveedor
     */
    public motoProveedor getMotProveedor() {
        return motProveedor;
    }

    /**
     * @param motProveedor the motProveedor to set
     */
    public void setMotProveedor(motoProveedor motProveedor) {
        this.motProveedor = motProveedor;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial_dos.servicio;

import com.mycompany.parcial_dos.modelo.motoMotocicleta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author pablo.suazo1
 */
@Stateless
public class motocicletaServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<motoMotocicleta> findMotocicletas(){
        
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<motoMotocicleta> query = builder.createQuery(motoMotocicleta.class); // SELECT
        query.from(motoMotocicleta.class); // FROM moto_motocicleta
        List<motoMotocicleta> motoMotocicletaList = entityManager.createQuery(query).getResultList();
        return motoMotocicletaList;
        
    }
}

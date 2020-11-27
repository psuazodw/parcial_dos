/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial_dos.rest;

import com.mycompany.parcial_dos.modelo.motoMotocicleta;
import com.mycompany.parcial_dos.servicio.motocicletaServicio;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Pablo Suazo
 */
@Path("/motocicletas")
public class MotocicletaEndpoint {
    
    @EJB
    private motocicletaServicio motocicletaServicio;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<motoMotocicleta> findMotocicletas(){
        return this.motocicletaServicio.findMotocicletas();
    }
}

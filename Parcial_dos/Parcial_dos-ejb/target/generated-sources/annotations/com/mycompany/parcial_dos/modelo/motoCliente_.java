package com.mycompany.parcial_dos.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(motoCliente.class)
public abstract class motoCliente_ {

	public static volatile SetAttribute<motoCliente, motoMotocicleta> motocicletaList;
	public static volatile SingularAttribute<motoCliente, String> cliNombre;
	public static volatile SingularAttribute<motoCliente, String> cliDireccion;
	public static volatile SingularAttribute<motoCliente, Date> cliCreado;
	public static volatile SingularAttribute<motoCliente, Integer> cliNit;
	public static volatile SingularAttribute<motoCliente, String> cliApellido;
	public static volatile SingularAttribute<motoCliente, Integer> cliId;

	public static final String MOTOCICLETA_LIST = "motocicletaList";
	public static final String CLI_NOMBRE = "cliNombre";
	public static final String CLI_DIRECCION = "cliDireccion";
	public static final String CLI_CREADO = "cliCreado";
	public static final String CLI_NIT = "cliNit";
	public static final String CLI_APELLIDO = "cliApellido";
	public static final String CLI_ID = "cliId";

}


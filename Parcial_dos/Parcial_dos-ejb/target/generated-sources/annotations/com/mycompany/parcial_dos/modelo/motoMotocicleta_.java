package com.mycompany.parcial_dos.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(motoMotocicleta.class)
public abstract class motoMotocicleta_ {

	public static volatile SingularAttribute<motoMotocicleta, Integer> motCliId;
	public static volatile SingularAttribute<motoMotocicleta, Integer> motProId;
	public static volatile SingularAttribute<motoMotocicleta, motoCliente> motCliente;
	public static volatile SingularAttribute<motoMotocicleta, Integer> motMarId;
	public static volatile SingularAttribute<motoMotocicleta, motoProveedor> motProveedor;
	public static volatile SingularAttribute<motoMotocicleta, Integer> motId;
	public static volatile SingularAttribute<motoMotocicleta, Integer> motCantidad;
	public static volatile SingularAttribute<motoMotocicleta, motoMarca> motMarca;
	public static volatile SingularAttribute<motoMotocicleta, Date> motCreado;

	public static final String MOT_CLI_ID = "motCliId";
	public static final String MOT_PRO_ID = "motProId";
	public static final String MOT_CLIENTE = "motCliente";
	public static final String MOT_MAR_ID = "motMarId";
	public static final String MOT_PROVEEDOR = "motProveedor";
	public static final String MOT_ID = "motId";
	public static final String MOT_CANTIDAD = "motCantidad";
	public static final String MOT_MARCA = "motMarca";
	public static final String MOT_CREADO = "motCreado";

}


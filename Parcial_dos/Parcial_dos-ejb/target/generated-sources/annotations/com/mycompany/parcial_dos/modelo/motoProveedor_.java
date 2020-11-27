package com.mycompany.parcial_dos.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(motoProveedor.class)
public abstract class motoProveedor_ {

	public static volatile SetAttribute<motoProveedor, motoMotocicleta> proveedorList;
	public static volatile SingularAttribute<motoProveedor, String> proDireccion;
	public static volatile SingularAttribute<motoProveedor, Integer> proNit;
	public static volatile SingularAttribute<motoProveedor, String> proNombre;
	public static volatile SingularAttribute<motoProveedor, Integer> proId;
	public static volatile SingularAttribute<motoProveedor, Date> proCreado;

	public static final String PROVEEDOR_LIST = "proveedorList";
	public static final String PRO_DIRECCION = "proDireccion";
	public static final String PRO_NIT = "proNit";
	public static final String PRO_NOMBRE = "proNombre";
	public static final String PRO_ID = "proId";
	public static final String PRO_CREADO = "proCreado";

}


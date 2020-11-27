package com.mycompany.parcial_dos.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(motoMarca.class)
public abstract class motoMarca_ {

	public static volatile SingularAttribute<motoMarca, String> marMarca;
	public static volatile SetAttribute<motoMarca, motoMotocicleta> motocicletaList;
	public static volatile SingularAttribute<motoMarca, Date> marCreado;
	public static volatile SingularAttribute<motoMarca, Integer> marId;
	public static volatile SingularAttribute<motoMarca, Integer> marExistencia;
	public static volatile SingularAttribute<motoMarca, String> marColor;
	public static volatile SingularAttribute<motoMarca, String> marModelo;

	public static final String MAR_MARCA = "marMarca";
	public static final String MOTOCICLETA_LIST = "motocicletaList";
	public static final String MAR_CREADO = "marCreado";
	public static final String MAR_ID = "marId";
	public static final String MAR_EXISTENCIA = "marExistencia";
	public static final String MAR_COLOR = "marColor";
	public static final String MAR_MODELO = "marModelo";

}


package com.inmo2.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="propiedades")
public class Propiedad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPropiedad;
	private String domicilioPropiedad;
	private String nomenclatura;
	private String tipoPropiedad;
	private String detallesPropiedad;
	
	public Propiedad() {
	}

	public Propiedad(int idPropiedad, String domicilioPropiedad, String nomenclatura, String tipoPropiedad,
			String detallesPropiedad) {
		this.idPropiedad = idPropiedad;
		this.domicilioPropiedad = domicilioPropiedad;
		this.nomenclatura = nomenclatura;
		this.tipoPropiedad = tipoPropiedad;
		this.detallesPropiedad = detallesPropiedad;
	}

	public int getIdPropiedad() {
		return idPropiedad;
	}

	public void setIdPropiedad(int idPropiedad) {
		this.idPropiedad = idPropiedad;
	}

	public String getDomicilioPropiedad() {
		return domicilioPropiedad;
	}

	public void setDomicilioPropiedad(String domicilioPropiedad) {
		this.domicilioPropiedad = domicilioPropiedad;
	}

	public String getNomenclatura() {
		return nomenclatura;
	}

	public void setNomenclatura(String nomenclatura) {
		this.nomenclatura = nomenclatura;
	}

	public String getTipoPropiedad() {
		return tipoPropiedad;
	}

	public void setTipoPropiedad(String tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}

	public String getDetallesPropiedad() {
		return detallesPropiedad;
	}

	public void setDetallesPropiedad(String detallesPropiedad) {
		this.detallesPropiedad = detallesPropiedad;
	}
	
	
}

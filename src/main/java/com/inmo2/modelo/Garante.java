package com.inmo2.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="garantes")
public class Garante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGarante;
	
	private String nombreGarante;
	private String apellidoGarante;
	private String mailGarante;
	private int dniGarante;
	private String telefonoGarante;
	private String domicilioGarante;
	
	public Garante() {
	}

	public Garante(int idGarante, String nombreGarante, String apellidoGarante, String mailGarante, int dniGarante,
			String telefonoGarante, String domicilioGarante) {
		this.idGarante = idGarante;
		this.nombreGarante = nombreGarante;
		this.apellidoGarante = apellidoGarante;
		this.mailGarante = mailGarante;
		this.dniGarante = dniGarante;
		this.telefonoGarante = telefonoGarante;
		this.domicilioGarante = domicilioGarante;
	}

	public int getIdGarante() {
		return idGarante;
	}

	public void setIdGarante(int idGarante) {
		this.idGarante = idGarante;
	}

	public String getNombreGarante() {
		return nombreGarante;
	}

	public void setNombreGarante(String nombreGarante) {
		this.nombreGarante = nombreGarante;
	}

	public String getApellidoGarante() {
		return apellidoGarante;
	}

	public void setApellidoGarante(String apellidoGarante) {
		this.apellidoGarante = apellidoGarante;
	}

	public String getMailGarante() {
		return mailGarante;
	}

	public void setMailGarante(String mailGarante) {
		this.mailGarante = mailGarante;
	}

	public int getDniGarante() {
		return dniGarante;
	}

	public void setDniGarante(int dniGarante) {
		this.dniGarante = dniGarante;
	}

	public String getTelefonoGarante() {
		return telefonoGarante;
	}

	public void setTelefonoGarante(String telefonoGarante) {
		this.telefonoGarante = telefonoGarante;
	}

	public String getDomicilioGarante() {
		return domicilioGarante;
	}

	public void setDomicilioGarante(String domicilioGarante) {
		this.domicilioGarante = domicilioGarante;
	}

	
}

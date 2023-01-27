package com.inmo2.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="inquilinos")
public class Inquilino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInquilino;

	private String nombreInquilino;
	private String apellidoInquilino;
	private String mailInquilino;
	private int dniInquilino;
	private String telefonoInquilino;
	
	public Inquilino() {
	}

	public Inquilino(int idInquilino, String nombreInquilino, String apellidoInquilino, String mailInquilino,
			int dniInquilino, String telefonoInquilino) {
		this.idInquilino = idInquilino;
		this.nombreInquilino = nombreInquilino;
		this.apellidoInquilino = apellidoInquilino;
		this.mailInquilino = mailInquilino;
		this.dniInquilino = dniInquilino;
		this.telefonoInquilino = telefonoInquilino;
	}

	public int getIdInquilino() {
		return idInquilino;
	}

	public void setIdInquilino(int idInquilino) {
		this.idInquilino = idInquilino;
	}

	public String getNombreInquilino() {
		return nombreInquilino;
	}

	public void setNombreInquilino(String nombreInquilino) {
		this.nombreInquilino = nombreInquilino;
	}

	public String getApellidoInquilino() {
		return apellidoInquilino;
	}

	public void setApellidoInquilino(String apellidoInquilino) {
		this.apellidoInquilino = apellidoInquilino;
	}

	public String getMailInquilino() {
		return mailInquilino;
	}

	public void setMailInquilino(String mailInquilino) {
		this.mailInquilino = mailInquilino;
	}

	public int getDniInquilino() {
		return dniInquilino;
	}

	public void setDniInquilino(int dniInquilino) {
		this.dniInquilino = dniInquilino;
	}

	public String getTelefonoInquilino() {
		return telefonoInquilino;
	}

	public void setTelefonoInquilino(String telefonoInquilino) {
		this.telefonoInquilino = telefonoInquilino;
	}
	
	
}

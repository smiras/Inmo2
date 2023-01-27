package com.inmo2.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Contrato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private int plazoContrato;
	private float canon1;
	private float canon2;
	private float canon3;
	private String fechaInicioContrato;
	private String fechaFinalContrato;
	private String alarma;
	
	@OneToMany
	private List<Garante> garantes;
	
	@OneToOne
	private Propietario propietario;
	
	@OneToOne
	private Inquilino inquilino;

	@OneToOne
	private Propiedad propiedad;

	public Contrato() {
	}

	public Contrato(int id, int plazoContrato, float canon1, float canon2, float canon3, String fechaInicioContrato,
			String fechaFinalContrato, String alarma, List<Garante> garantes, Propietario propietario,
			Inquilino inquilino, Propiedad propiedad) {
		this.id = id;
		this.plazoContrato = plazoContrato;
		this.canon1 = canon1;
		this.canon2 = canon2;
		this.canon3 = canon3;
		this.fechaInicioContrato = fechaInicioContrato;
		this.fechaFinalContrato = fechaFinalContrato;
		this.alarma = alarma;
		this.garantes = garantes;
		this.propietario = propietario;
		this.inquilino = inquilino;
		this.propiedad = propiedad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlazoContrato() {
		return plazoContrato;
	}

	public void setPlazoContrato(int plazoContrato) {
		this.plazoContrato = plazoContrato;
	}

	public float getCanon1() {
		return canon1;
	}

	public void setCanon1(float canon1) {
		this.canon1 = canon1;
	}

	public float getCanon2() {
		return canon2;
	}

	public void setCanon2(float canon2) {
		this.canon2 = canon2;
	}

	public float getCanon3() {
		return canon3;
	}

	public void setCanon3(float canon3) {
		this.canon3 = canon3;
	}

	public String getFechaInicioContrato() {
		return fechaInicioContrato;
	}

	public void setFechaInicioContrato(String fechaInicioContrato) {
		this.fechaInicioContrato = fechaInicioContrato;
	}

	public String getFechaFinalContrato() {
		return fechaFinalContrato;
	}

	public void setFechaFinalContrato(String fechaFinalContrato) {
		this.fechaFinalContrato = fechaFinalContrato;
	}

	public String getAlarma() {
		return alarma;
	}

	public void setAlarma(String alarma) {
		this.alarma = alarma;
	}

	public List<Garante> getGarantes() {
		return garantes;
	}

	public void setGarantes(List<Garante> garantes) {
		this.garantes = garantes;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Inquilino getInquilino() {
		return inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	
}

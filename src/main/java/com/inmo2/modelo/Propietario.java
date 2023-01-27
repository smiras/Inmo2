package com.inmo2.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "propietarios")
public class Propietario {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPropietario;
	
	private String nombrePropietario;
	private String apellidoPropietario;
	private String mailPropietario;
	private int dniPropietario;
	private String cuentaBancariaPropietario;
	private String telefonoPropietario;
    public Propietario() {
    }
    public Propietario(int idPropietario, String nombrePropietario, String apellidoPropietario, String mailPropietario,
            int dniPropietario, String cuentaBancariaPropietario, String telefonoPropietario) {
        this.idPropietario = idPropietario;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.mailPropietario = mailPropietario;
        this.dniPropietario = dniPropietario;
        this.cuentaBancariaPropietario = cuentaBancariaPropietario;
        this.telefonoPropietario = telefonoPropietario;
    }
    public int getIdPropietario() {
        return idPropietario;
    }
    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }
    public String getNombrePropietario() {
        return nombrePropietario;
    }
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
    public String getApellidoPropietario() {
        return apellidoPropietario;
    }
    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }
    public String getMailPropietario() {
        return mailPropietario;
    }
    public void setMailPropietario(String mailPropietario) {
        this.mailPropietario = mailPropietario;
    }
    public int getDniPropietario() {
        return dniPropietario;
    }
    public void setDniPropietario(int dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
    public String getCuentaBancariaPropietario() {
        return cuentaBancariaPropietario;
    }
    public void setCuentaBancariaPropietario(String cuentaBancariaPropietario) {
        this.cuentaBancariaPropietario = cuentaBancariaPropietario;
    }
    public String getTelefonoPropietario() {
        return telefonoPropietario;
    }
    public void setTelefonoPropietario(String telefonoPropietario) {
        this.telefonoPropietario = telefonoPropietario;
    }

    
    
}

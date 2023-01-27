package com.inmo2.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reclamos")
public class Reclamo {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date fechaReclamo;
	private String reclamo;
	private String solucion;
	private int Id_Propiedad;
    
    public Reclamo() {
    }
    
    public Reclamo(int id, Date fechaReclamo, String reclamo, String solucion, int id_Propiedad) {
        this.id = id;
        this.fechaReclamo = fechaReclamo;
        this.reclamo = reclamo;
        this.solucion = solucion;
        Id_Propiedad = id_Propiedad;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFechaReclamo() {
        return fechaReclamo;
    }
    public void setFechaReclamo(Date fechaReclamo) {
        this.fechaReclamo = fechaReclamo;
    }
    public String getReclamo() {
        return reclamo;
    }
    public void setReclamo(String reclamo) {
        this.reclamo = reclamo;
    }
    public String getSolucion() {
        return solucion;
    }
    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }
    public int getId_Propiedad() {
        return Id_Propiedad;
    }
    public void setId_Propiedad(int id_Propiedad) {
        Id_Propiedad = id_Propiedad;
    }
    
    
}

package com.generation.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Se convierte en una entidad como tabla de ua base de datos
@Table(name="salon")
public class SalonModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Autoinrementable
@Column(unique = true, nullable = false)
	private Integer id;
	
	@Column(name="materia", nullable = false, length = 120 )
private String materia;
	
	@Column(name="maestro", nullable = false, length = 120 )
private String maestro;
	
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getMateria() {
	return materia;
}
public void setMateria(String materia) {
	this.materia = materia;
}
public String getMaestro() {
	return maestro;
}
public void setMaestro(String maestro) {
	this.maestro = maestro;
}
@Override
public String toString() {
	return "SalonModel [id=" + id + ", materia=" + materia + ", maestro=" + maestro + "]";
}


}

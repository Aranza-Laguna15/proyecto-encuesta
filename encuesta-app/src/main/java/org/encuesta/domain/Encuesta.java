package org.encuesta.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="informacion")
public class Encuesta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idinformacion")
	private int idEncuesta;
	@Column(name="nombreNegocio")
	@NotEmpty
	private String nombreNegocio;
	@Column(name="giroNegocio")
	@NotEmpty
	private String giroNegocio;
	@Column(name="nombre")
	private String nombre;
	@Column(name="telefono")
	@Pattern(regexp="[0-9]{10}")
	private String telefono;
	@Column(name="direccion")
	private String direccion;
	@Column(name="cmpActual")
	private String cmpActual;
	@Column(name="comiActual")
	private double comiActual;
	@Column(name="lgt")
	private double longitud;
	@Column(name="lat")
	private double latitud;
	@Column(name="fecha")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date fecha;
	@Column(name="username")
	@NotEmpty
	private String username;
	public int getIdEncuesta() {
		return idEncuesta;
	}
	public void setIdEncuesta(int idEncuesta) {
		this.idEncuesta = idEncuesta;
	}
	public String getNombreNegocio() {
		return nombreNegocio;
	}
	public void setNombreNegocio(String nombreNegocio) {
		this.nombreNegocio = nombreNegocio;
	}
	public String getGiroNegocio() {
		return giroNegocio;
	}
	public void setGiroNegocio(String giroNegocio) {
		this.giroNegocio = giroNegocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCmpActual() {
		return cmpActual;
	}
	public void setCmpActual(String cmpActual) {
		this.cmpActual = cmpActual;
	}
	public double getComiActual() {
		return comiActual;
	}
	public void setComiActual(double comiActual) {
		this.comiActual = comiActual;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}

package org.encuesta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="users")
public class Usuario {
	@Id
	@Column(name="id_eliminados")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="username")
	@NotEmpty(message="Ingrese el nombre de usuario")
	private String username;
	@Column(name="name")
	@NotEmpty(message="Ingrese el nombre del usuario")
	private String name;
	@Column(name="password")
	@NotEmpty(message="Ingrese la clave del usuario")
	private String password;
	@Column(name="enabled")
	private boolean enabled;
	private String fecha, elim;
	/*public Usuario() {
		this.username = "5555555555";
		this.name = "Victor de la Cruz Gonzalez";
		this.password = "12345678";
		this.enabled = true;
	}*/
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public void setIdDelete(int id){
		this.id=id;
	}
	public int getIdDelete(){
		return this.id;
	}
	public void setfechaDelete(String fecha){
		this.fecha=fecha;
	}
	public String getfechaDelete(){
		return this.fecha;
	}
	public void setEliminadoPor(String elim){
		this.elim=elim;
	}
	public String getEliminadoPor(){
		return this.elim;
	}
	@Override
	public String toString() {
		return "Usuario [username=" + username + ", name=" + name
				+ ", password=" + password + ", enabled=" + enabled + "]";
	}
	public String deleteString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("id eliminado: "+ id);
		buffer.append("username: "+ username);
		buffer.append("password: "+ password);
		buffer.append("name: "+ name);
		buffer.append("enabled: "+ enabled);
		buffer.append("fecha eliminacion: "+ fecha);
		buffer.append("eliminado por: "+ elim);
		return buffer.toString();
	}
	
}

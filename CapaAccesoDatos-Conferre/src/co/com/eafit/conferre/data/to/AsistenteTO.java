package co.com.eafit.conferre.data.to;

import co.com.eafit.conferre.data.base.ObjetoTO;

public class AsistenteTO implements ObjetoTO {
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getNombre_conferencia() {
		return nombre_conferencia;
	}
	public void setNombre_conferencia(String nombre_conferencia) {
		this.nombre_conferencia = nombre_conferencia;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	private String nombre;
	private String email;
	private int cedula;
	private String nombre_conferencia;
	private int telefono;
	
}

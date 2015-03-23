package co.com.eafit.conferre.data.to;

import co.com.eafit.conferre.data.base.ObjetoTO;

public class ClienteTO implements ObjetoTO {
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	private String nombre;
	private int cedula;
	private int telefono;
	private String email;
	
	
}

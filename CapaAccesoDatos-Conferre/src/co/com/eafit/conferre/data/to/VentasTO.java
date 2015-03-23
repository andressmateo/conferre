package co.com.eafit.conferre.data.to;

import co.com.eafit.conferre.data.base.ObjetoTO;
import java.util.Date;

public class VentasTO implements ObjetoTO {
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	private Date fecha;
	private int cantidad;
	private double valor;
	private String cedula_cliente;
	
	
	
}
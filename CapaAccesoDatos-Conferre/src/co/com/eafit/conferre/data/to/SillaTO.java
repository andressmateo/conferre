package co.com.eafit.conferre.data.to;

import co.com.eafit.conferre.data.base.ObjetoTO;

public class SillaTO implements ObjetoTO {
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	private String type;
	private int stock;
	

}

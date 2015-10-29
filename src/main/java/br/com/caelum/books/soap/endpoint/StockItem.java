package br.com.caelum.books.soap.endpoint;

import java.io.Serializable;

public class StockItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	
	private Integer quantity;
	
	private transient Integer internalCode; //won't be serialized
	
	@Deprecated //JAX-B constructor
	StockItem() {
	}

	public StockItem(String code, Integer quantity, Integer internalCode) {
		this.code = code;
		this.quantity = quantity;
		this.internalCode = internalCode;
	}
	
	public void decreaseQuantity(Integer quantity) {
		this.quantity -= quantity;
	}

	public Integer getInternalCode() {
		return internalCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "code: " + this.code + ", quantity: " + this.quantity;
	}
	
}

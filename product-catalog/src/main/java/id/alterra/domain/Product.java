package id.alterra.domain;

import java.io.Serializable;
import id.alterra.domain.Seller;

public class Product implements Serializable {
	
	private static final long serialVersionUID = -3248860749851411314L;
	/**
	 * 
	 */
	private Long id ;
	private String name;
	private String description;
	private Seller seller;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Seller seller) {
		super();
		this.seller = seller;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	

}

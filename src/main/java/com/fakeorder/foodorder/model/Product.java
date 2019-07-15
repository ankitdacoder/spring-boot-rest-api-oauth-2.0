package com.fakeorder.foodorder.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable {
 
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
    @Column(name = "unit_price")
	private Double unitPrice;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "name")
	private String name;
	
	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "product") private
	 * Set<ShoppingCart> shoppingCarts = new HashSet<>();
	 */
	    public Product(){

	    }	
	

	public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public Double getUnitPrice() {
			return unitPrice;
		}


		public void setUnitPrice(Double unitPrice) {
			this.unitPrice = unitPrice;
		}


		public Integer getQuantity() {
			return quantity;
		}


		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


	public Product(Double unitPrice, Integer quantity, String description, String name) {
		super();
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.description = description;
		this.name = name;
	}
	
}

package com.capgemini.drinkanddelight.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
public class ProductSpecs {

	@Id
	private int productId;
	private String name;
	private double pricePerUnit;
	private int duration;
	private String description;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "ProductSpecs [productId=" + productId + ", name=" + name + ", pricePerUnit=" + pricePerUnit
				+ ", duration=" + duration + ", description=" + description + "]";
	}
	
	
	public ProductSpecs(int productId, String name, double pricePerUnit, int duration, String description) {
		super();
		this.productId = productId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.duration = duration;
		this.description = description;
	}
	
	
	public ProductSpecs() {
		super();
	}

}

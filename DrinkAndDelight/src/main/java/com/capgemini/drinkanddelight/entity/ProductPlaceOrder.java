package com.capgemini.drinkanddelight.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
public class ProductPlaceOrder {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productOrder_sequence")
	//@SequenceGenerator(sequenceName = "productOrder_sequence", allocationSize = 101, name = "productOrder_sequence")
	private int orderId;
	
	@Column(name="Name", length = 20)
	private String name;
	
	private String distributorId;
	private float quantityValue;
	private String quantityUnit;
	private Date dateOfOrder;
	private Date dateOfDelivery;
	private double pricePerUnit;
	private double totalPrice;
	private String deliveryStatus;
	private String warehouseId;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}
	public float getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(float quantityValue) {
		this.quantityValue = quantityValue;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	
	
	@Override
	public String toString() {
		return "ProductPlaceOrder [orderId=" + orderId + ", name=" + name + ", distributorId=" + distributorId
				+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", dateOfOrder=" + dateOfOrder
				+ ", dateOfDelivery=" + dateOfDelivery + ", pricePerUnit=" + pricePerUnit + ", totalPrice=" + totalPrice
				+ ", deliveryStatus=" + deliveryStatus + ", warehouseId=" + warehouseId + "]";
	}
	
	
	public ProductPlaceOrder(int orderId, String name, String distributorId, float quantityValue, String quantityUnit,
			Date dateOfOrder, Date dateOfDelivery, double pricePerUnit, double totalPrice, String deliveryStatus,
			String warehouseId) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.distributorId = distributorId;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.dateOfOrder = dateOfOrder;
		this.dateOfDelivery = dateOfDelivery;
		this.pricePerUnit = pricePerUnit;
		this.totalPrice = totalPrice;
		this.deliveryStatus = deliveryStatus;
		this.warehouseId = warehouseId;
	}
	
	
	public ProductPlaceOrder() {
		super();
	}
	
}

package com.capgemini.drinkanddelight.dao;

import java.util.List;

import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;

public interface ProductPlaceAnOrderDao {

	public List<ProductSpecs> ProductList();
	public boolean placeAnOrder(ProductPlaceOrder productOrder);
	public void cancelAnOrder(int orderId);
	public List<ProductPlaceOrder> RawMaterialList();
	
}

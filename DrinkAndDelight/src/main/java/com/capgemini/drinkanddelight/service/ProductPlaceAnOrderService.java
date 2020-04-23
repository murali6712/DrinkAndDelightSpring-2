package com.capgemini.drinkanddelight.service;

import java.util.List;

import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;


public interface ProductPlaceAnOrderService {

	public List<ProductSpecs> ProductList();
	public void productPlaceOrder(ProductPlaceOrder productOrder);
	public void productCancelOrder(int orderId);
	public List<ProductPlaceOrder> RawMaterialList();
	
}

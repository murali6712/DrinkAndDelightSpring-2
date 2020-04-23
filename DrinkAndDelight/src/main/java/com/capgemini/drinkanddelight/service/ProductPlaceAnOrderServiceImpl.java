package com.capgemini.drinkanddelight.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.drinkanddelight.dao.ProductPlaceAnOrderDao;
import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;


@Transactional
@Service
public class ProductPlaceAnOrderServiceImpl implements ProductPlaceAnOrderService{

	@Autowired
	private ProductPlaceAnOrderDao placeAnOrderDao;
	

	@Override
	public List<ProductSpecs> ProductList() {
		// TODO Auto-generated method stub
		List<ProductSpecs> list = placeAnOrderDao.ProductList();
		return list;
	}


	@Override
	public void productPlaceOrder(ProductPlaceOrder productOrder) {
		// TODO Auto-generated method stub
		boolean orderStatus = placeAnOrderDao.placeAnOrder(productOrder);
		if(orderStatus == false)
		{
			System.out.println("Product Order Failed!!!");
		}
		else
		{
			System.out.println("Product Order Placed Successfully");
		}
	}


	@Override
	public void productCancelOrder(int orderId) {
		// TODO Auto-generated method stub
		placeAnOrderDao.cancelAnOrder(orderId);
	}


	@Override
	public List<ProductPlaceOrder> RawMaterialList() {
		// TODO Auto-generated method stub
		List<ProductPlaceOrder> list = placeAnOrderDao.RawMaterialList();
		return list;
	}

}

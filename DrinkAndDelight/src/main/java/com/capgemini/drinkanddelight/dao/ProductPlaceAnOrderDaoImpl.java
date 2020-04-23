package com.capgemini.drinkanddelight.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;

@Transactional
@Repository
public class ProductPlaceAnOrderDaoImpl implements ProductPlaceAnOrderDao{

	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public List<ProductSpecs> ProductList() {
		// TODO Auto-generated method stub
		String Qstr = "SELECT product_specs FROM ProductSpecs product_specs";
		TypedQuery<ProductSpecs> query = entityManager.createQuery(Qstr, ProductSpecs.class);
		return query.getResultList();
	}


	@Override
	public boolean placeAnOrder(ProductPlaceOrder productOrder) {
		// TODO Auto-generated method stub
		entityManager.persist(productOrder);
		return true;
	}


	@Override
	public void cancelAnOrder(int orderId) {
		// TODO Auto-generated method stub
		entityManager.remove(entityManager.find(ProductPlaceOrder.class, orderId));
	}


	@Override
	public List<ProductPlaceOrder> RawMaterialList() {
		// TODO Auto-generated method stub
		String Qstr = "SELECT product_place_order FROM ProductPlaceOrder product_place_order";
		TypedQuery<ProductPlaceOrder> query = entityManager.createQuery(Qstr, ProductPlaceOrder.class);
		return query.getResultList();
	}

}

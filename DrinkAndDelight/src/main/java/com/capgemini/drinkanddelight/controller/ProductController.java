package com.capgemini.drinkanddelight.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;
import com.capgemini.drinkanddelight.service.ProductPlaceAnOrderService;

@RestController
@RequestMapping("/sprint2")
public class ProductController {

	@Autowired
	private ProductPlaceAnOrderService PlaceAnOrderService;
	
	
	@GetMapping("/GetProductDetails")
	public ResponseEntity<List<ProductSpecs>> getProductlist() 
	{
		List<ProductSpecs> list = PlaceAnOrderService.ProductList();
		return new ResponseEntity<List<ProductSpecs>>(list,HttpStatus.OK);
	}
	
	
	@GetMapping("/GetDetails")
	public ResponseEntity<List<ProductPlaceOrder>> getlist() 
	{
		List<ProductPlaceOrder> list = PlaceAnOrderService.RawMaterialList();
		return new ResponseEntity<List<ProductPlaceOrder>>(list,HttpStatus.OK);
	}
	
	
	@PostMapping("/placeProductOrder")
	public ResponseEntity<String> addProductOrder(@RequestBody ProductPlaceOrder productOrder)
	{
		PlaceAnOrderService.productPlaceOrder(productOrder);
		return new ResponseEntity<String>("Placed ProductOrder Successfully",HttpStatus.OK);
	}
	
	
	@DeleteMapping("/cancelProductOrder/{id}")
	public ResponseEntity<String> deleteProductOrder(@PathVariable int id)
	{
		PlaceAnOrderService.productCancelOrder(id);
		return new ResponseEntity<String>("Deleted ProductOrder Successfully", HttpStatus.OK);
	}
}
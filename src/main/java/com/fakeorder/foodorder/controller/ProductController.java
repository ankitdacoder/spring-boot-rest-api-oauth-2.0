package com.fakeorder.foodorder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fakeorder.foodorder.model.Product;
import com.fakeorder.foodorder.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
    private ProductService productService;
    
	@RequestMapping(value="/getAll", method=RequestMethod.GET,produces = "application/json")
	public List<Product> getAll()
	{  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return productService.findAll();
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.POST,produces = "application/json")
	public Optional<Product> singleProduct(@PathVariable long id)
	{   System.out.println("id "+id);
		return productService.getSingleProduct(id);
	}
	
	
}

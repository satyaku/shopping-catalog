package com.catalog.shopping.shoppingcatalog.repository.implementation;

import javax.inject.Inject;

import com.catalog.shopping.shoppingcatalog.dto.ProductResponseDTO;
import com.catalog.shopping.shoppingcatalog.repository.interfaces.IProductRepository;
import com.catalog.shopping.shoppingcatalog.repository.interfaces.ProductRepo;

import reactor.core.publisher.Flux;

public class ProductRepository implements IProductRepository {
	
	@Inject
	private ProductRepo productRepo;

	@Override
	public Flux<ProductResponseDTO> getAllProducts() {
		return productRepo.findAll();
		
	}

}

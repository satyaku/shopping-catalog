package com.catalog.shopping.shoppingcatalog.repository.interfaces;

import com.catalog.shopping.shoppingcatalog.dto.ProductResponseDTO;

import reactor.core.publisher.Flux;

public interface IProductRepository {
	
	Flux<ProductResponseDTO> getAllProducts();

}

package com.catalog.shopping.shoppingcatalog.services.interfaces;

import com.catalog.shopping.shoppingcatalog.dto.ProductResponseDTO;
import com.catalog.shopping.shoppingcatalog.models.ProductResponse;

import reactor.core.publisher.Flux;

public interface IAllProductsApplicationService {
	
	public Flux<ProductResponseDTO> getAllProductDetails(); 

}

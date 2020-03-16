package com.catalog.shopping.shoppingcatalog.sevices.implementation;

import javax.inject.Inject;

import com.catalog.shopping.shoppingcatalog.dto.ProductResponseDTO;
import com.catalog.shopping.shoppingcatalog.exceptionhandling.ResponseNullException;
import com.catalog.shopping.shoppingcatalog.mappers.interfaces.IMapProductResponseDTOListToProductResponseList;
import com.catalog.shopping.shoppingcatalog.models.ProductResponse;
import com.catalog.shopping.shoppingcatalog.repository.interfaces.IProductRepository;
import com.catalog.shopping.shoppingcatalog.services.interfaces.IAllProductsApplicationService;

import reactor.core.publisher.Flux;

public class AllProductsApplicationService implements IAllProductsApplicationService {
	
	@Inject
	private IProductRepository productRepository;
	
	@Inject
	private IMapProductResponseDTOListToProductResponseList mapProductResponseDTOListToProductResponseList;

	@Override
	public Flux<ProductResponseDTO> getAllProductDetails() {
		
		Flux<ProductResponseDTO> productResponseDTOList = productRepository.getAllProducts();
		/*Flux<ProductResponse> productResponseList = null;
		
		try {
			productResponseList = mapProductResponseDTOListToProductResponseList.map(productResponseDTOList);
		} catch (ResponseNullException e) {
			e.printStackTrace();
		}*/
		
		return productResponseDTOList;
		
	}

}

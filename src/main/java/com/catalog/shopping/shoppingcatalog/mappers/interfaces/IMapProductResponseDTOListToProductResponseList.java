package com.catalog.shopping.shoppingcatalog.mappers.interfaces;

import com.catalog.shopping.shoppingcatalog.dto.ProductResponseDTO;
import com.catalog.shopping.shoppingcatalog.exceptionhandling.ResponseNullException;
import com.catalog.shopping.shoppingcatalog.models.ProductResponse;

import reactor.core.publisher.Flux;

public interface IMapProductResponseDTOListToProductResponseList {
	
	public Flux<ProductResponse> map(Flux<ProductResponseDTO> productResponseDTOList) throws ResponseNullException;

}

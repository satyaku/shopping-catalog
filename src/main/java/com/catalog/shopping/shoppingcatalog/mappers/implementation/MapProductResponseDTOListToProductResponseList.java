package com.catalog.shopping.shoppingcatalog.mappers.implementation;

import javax.inject.Inject;
import javax.inject.Provider;

import com.catalog.shopping.shoppingcatalog.dto.ProductResponseDTO;
import com.catalog.shopping.shoppingcatalog.dto.interfaces.IProductResponseDTO;
import com.catalog.shopping.shoppingcatalog.exceptionhandling.ResponseNullException;
import com.catalog.shopping.shoppingcatalog.mappers.interfaces.IMapProductResponseDTOListToProductResponseList;
import com.catalog.shopping.shoppingcatalog.models.ProductResponse;
import com.catalog.shopping.shoppingcatalog.models.interfaces.IProductResponse;

import reactor.core.publisher.Flux;

public class MapProductResponseDTOListToProductResponseList implements IMapProductResponseDTOListToProductResponseList {
	
	@Inject
	private Provider<IProductResponse> productResponseProvider;

	@Override
	public Flux<ProductResponse> map(Flux<ProductResponseDTO> productResponseDTOList) throws ResponseNullException {
		
		if(null == productResponseDTOList)
			throw new ResponseNullException("productResponseDTOList is null or empty");
		
		Flux<ProductResponse> productResponseList = null;
		productResponseDTOList.subscribe((productResponseDTO) -> {
			try {
				Flux.just(map(productResponseDTO));
			} catch (ResponseNullException e) {
				e.printStackTrace();
			}
		});
		return productResponseList;
	}

	private ProductResponse map(IProductResponseDTO productResponseDTO) throws ResponseNullException {
		
		if(null == productResponseDTO)
			throw new ResponseNullException("productResponseDTO is null or empty");
		
		IProductResponse productResponse = productResponseProvider.get();
		
		productResponse.setBrand_id(productResponseDTO.getBrand_id());
		productResponse.setColor(productResponseDTO.getColor());
		productResponse.setDescription(productResponseDTO.getDescription());
		productResponse.setId(productResponseDTO.getId());
		productResponse.setItem_size(productResponseDTO.getItem_size());
		productResponse.setName(productResponseDTO.getName());
		productResponse.setPrice(productResponseDTO.getPrice());
		productResponse.setSeller_id(productResponseDTO.getSeller_id());
		productResponse.setSku(productResponseDTO.getSku());
		productResponse.setStatus(productResponseDTO.getStatus());
		productResponse.setTotal_count(productResponseDTO.getTotal_count());
		
		return (ProductResponse) productResponse;
		
	}

}

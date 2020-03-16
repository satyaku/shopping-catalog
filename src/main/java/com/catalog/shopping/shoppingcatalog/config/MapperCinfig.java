package com.catalog.shopping.shoppingcatalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.catalog.shopping.shoppingcatalog.mappers.implementation.MapProductResponseDTOListToProductResponseList;
import com.catalog.shopping.shoppingcatalog.mappers.interfaces.IMapProductResponseDTOListToProductResponseList;

@Configuration
public class MapperCinfig {
	
	@Bean
	public IMapProductResponseDTOListToProductResponseList getMapProductResponseDTOListToProductResponseList(){
		return new MapProductResponseDTOListToProductResponseList();
	}

}

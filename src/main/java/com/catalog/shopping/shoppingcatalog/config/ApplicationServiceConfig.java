package com.catalog.shopping.shoppingcatalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.catalog.shopping.shoppingcatalog.services.interfaces.IAllProductsApplicationService;
import com.catalog.shopping.shoppingcatalog.sevices.implementation.AllProductsApplicationService;

@Configuration
public class ApplicationServiceConfig {
	
	@Bean
	public IAllProductsApplicationService getAllProductsApplicationService(){
					return new AllProductsApplicationService();
	}

}

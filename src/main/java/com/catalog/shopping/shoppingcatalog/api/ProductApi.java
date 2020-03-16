package com.catalog.shopping.shoppingcatalog.api;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.shopping.shoppingcatalog.dto.ProductResponseDTO;
import com.catalog.shopping.shoppingcatalog.services.interfaces.IAllProductsApplicationService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/catalog/v1")
public class ProductApi {
	
	@Inject
	private IAllProductsApplicationService allProductsApplicationService;
	
	@GetMapping("/products")
    public Flux<ProductResponseDTO> getAllProducts() {
        return allProductsApplicationService.getAllProductDetails();
    }

}

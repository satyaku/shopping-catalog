package com.catalog.shopping.shoppingcatalog.repository.interfaces;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.catalog.shopping.shoppingcatalog.dto.ProductResponseDTO;

import reactor.core.publisher.Flux;

@Repository
public interface ProductRepo extends ReactiveCrudRepository<ProductResponseDTO, Long> {
	
	@Query("SELECT * FROM product WHERE status = 'Available'")
    Flux<ProductResponseDTO> findAll();

}

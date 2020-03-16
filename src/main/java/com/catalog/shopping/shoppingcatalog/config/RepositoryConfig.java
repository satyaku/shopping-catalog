package com.catalog.shopping.shoppingcatalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.function.DatabaseClient;
import org.springframework.data.r2dbc.repository.support.R2dbcRepositoryFactory;
import org.springframework.data.relational.core.mapping.RelationalMappingContext;

import com.catalog.shopping.shoppingcatalog.repository.implementation.ProductRepository;
import com.catalog.shopping.shoppingcatalog.repository.interfaces.IProductRepository;
import com.catalog.shopping.shoppingcatalog.repository.interfaces.ProductRepo;

import io.r2dbc.h2.H2ConnectionConfiguration;
import io.r2dbc.h2.H2ConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;

@Configuration
public class RepositoryConfig {
	
	@Bean
	public IProductRepository getProductRepository(){
		return new ProductRepository();
	}
	
	@Bean
	public ProductRepo getProductRepo(R2dbcRepositoryFactory factory){
		return factory.getRepository(ProductRepo.class);
	}
	
	@Bean
    R2dbcRepositoryFactory factory(DatabaseClient client) {
        RelationalMappingContext context = new RelationalMappingContext();
        context.afterPropertiesSet();
        return new R2dbcRepositoryFactory(client, context);
    }

    @Bean
    DatabaseClient databaseClient(ConnectionFactory factory) {
        return DatabaseClient.builder().connectionFactory(factory).build();
    }

    @Bean
    H2ConnectionFactory connectionFactory() {
        H2ConnectionConfiguration config = H2ConnectionConfiguration.builder()
                .username("sa")
                .password("")
                .url("mem:testdb")
                .build();

        return new H2ConnectionFactory(config);
    }

}

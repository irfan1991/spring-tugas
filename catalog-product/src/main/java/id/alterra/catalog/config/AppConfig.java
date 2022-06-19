package id.alterra.catalog.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import id.alterra.catalog.domain.Product;
import id.alterra.catalog.domain.Seller;
import id.alterra.catalog.repository.ProductRepository;
import id.alterra.catalog.repository.impl.ProductRepositoryImpl;


@Configuration
public class AppConfig {
	
	@Bean
	public Seller seller() {
		return new Seller(1L,"Pramoedya Ananta Toer", -16401L);
	}
	
	@Bean
	public Product product1(Seller seller) {
		Product product = new Product();
		product.setId(1L);
		product.setName("Baju");
		product.setDescription("Ini baju baru");
		product.setSeller(seller);
		return product;
	}
	
	@Bean
	public Product product2(Seller seller) {
		Product product = new Product();
		product.setId(2L);
		product.setName("Buku");
		product.setDescription("Ini buku baru");
		product.setSeller(seller);
		return product;
	}
	
	@Bean
	public ProductRepository productRepository(Product product1, Product product2) {
		Map<Long, Product> productMap2 = new HashMap<Long, Product>();
		productMap2.put(1L, product1);
		productMap2.put(2L, product2);
		
		ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
		productRepository.setProductMap(productMap2);
		
		return productRepository;
	}
	
	
//	@Bean
//	public ProductService productService(ProductRepository productRepository) {
//		return new ProductServiceImpl(productRepository);
//	}
	
}

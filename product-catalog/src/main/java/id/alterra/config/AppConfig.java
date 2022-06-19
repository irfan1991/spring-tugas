package id.alterra.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import id.alterra.domain.Product;
import id.alterra.domain.Seller;
import id.alterra.repository.impl.ProductRepositoryImpl;
import id.alterra.repository.ProductRepository;
import id.alterra.service.impl.ProductServiceImpl;
import id.alterra.service.ProductService;

@ComponentScan(basePackages= {"id.alterra"})
@Configuration
public class AppConfig {
	
	@Bean
	public Seller seller() {
		return new Seller(1L, -16401L,"Pramoedya Ananta Toer");
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
		Map<Long, Product> productMap = new HashMap<Long, Product>();
		productMap.put(1L, product1);
		productMap.put(2L, product2);
		
		ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
		productRepository.setProductMap(productMap);
		
		return productRepository;
	}
	
	
//	@Bean
//	public ProductService productService(ProductRepository productRepository) {
//		return new ProductServiceImpl(productRepository);
//	}
	
}

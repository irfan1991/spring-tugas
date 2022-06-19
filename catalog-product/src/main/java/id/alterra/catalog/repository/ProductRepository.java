package id.alterra.catalog.repository;

import java.util.List;

import id.alterra.catalog.domain.Product;

public interface ProductRepository {
	public Product findProductById(Long id);
	public List<Product> findAll();
	public void save(Product product);
}

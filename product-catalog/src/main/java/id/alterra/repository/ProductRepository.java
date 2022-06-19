package id.alterra.repository;

import id.alterra.domain.Product;

public interface ProductRepository {
	public Product findProductById(Long id);
}

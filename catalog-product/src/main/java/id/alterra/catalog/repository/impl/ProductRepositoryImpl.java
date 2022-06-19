package id.alterra.catalog.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import id.alterra.catalog.repository.ProductRepository;
import id.alterra.catalog.domain.Product;
import lombok.Data;

@Data
public class ProductRepositoryImpl implements ProductRepository {

	private Map<Long, Product> productMap;
	
	@Override
	public Product findProductById(Long id) {
		Product product = productMap.get(id);
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> productList = new ArrayList<Product>(productMap.values());
		return productList;
	}

	@Override
	public void save(Product product) {
		//size = 2, -> 1,2
		int size = productMap.size();
		product.setId((long) size+1);
		productMap.put(product.getId(), product);
		
	}


}

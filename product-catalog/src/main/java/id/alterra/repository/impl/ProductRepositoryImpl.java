package id.alterra.repository.impl;

import java.util.HashMap;
import java.util.Map;

import id.alterra.domain.Product;
import id.alterra.domain.Seller;
import id.alterra.repository.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {

private Map<Long, Product> productMap;

	

//	public ProductRepositoryImpl() {
//		super();
//		productMap = new HashMap<Long, Product>();
//		Seller seller = new Seller();
//		seller.setId(1L);
//		seller.setName("Pramoedya Ananta Toer");
//		seller.setBirthDate(-16401L);
//		
//		Product product1 = new Product(seller);
//		product1.setId(1L);
//		product1.setName("Baju");
//		product1.setDescription("Baju Baru");
//
//		
//		productMap.put(product1.getId(), product1);
//	}


	@Override
	public Product findProductById(Long id) {
		// TODO Auto-generated method stub
		Product product = productMap.get(id);
		return product;
	}


	public Map<Long, Product> getProductMap() {
		return productMap;
	}


	public void setProductMap(Map<Long, Product> productMap) {
		this.productMap = productMap;
	}
	
	

}

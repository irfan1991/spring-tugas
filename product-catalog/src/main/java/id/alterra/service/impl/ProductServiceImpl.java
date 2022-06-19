package id.alterra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.alterra.domain.Product;
import id.alterra.domain.Seller;
import id.alterra.dto.ProductDetailDTO;
import id.alterra.repository.ProductRepository;
import id.alterra.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	private Product product;
	private ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
//		Seller seller = new Seller();
//		product = new Product(seller);
		super();
		this.productRepository = productRepository;
	}

	@Override
	public ProductDetailDTO findProductDetailById(Long id) {
		// TODO Auto-generated method stub
		Product product = productRepository.findProductById(id);
		ProductDetailDTO dto = new ProductDetailDTO();
		dto.setProductId(product.getId());
		dto.setHarga(20000);
		dto.setStock(200);
		
		return dto;
	}

//	public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}

//	public ProductRepository getProductRepository() {
//		return productRepository;
//	}
//
//	public void setProductRepository(ProductRepository productRepository) {
//		this.productRepository = productRepository;
//	}
	
	
	
}

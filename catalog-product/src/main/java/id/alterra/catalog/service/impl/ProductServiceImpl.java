package id.alterra.catalog.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import id.alterra.catalog.domain.Product;
import id.alterra.catalog.domain.Seller;
import id.alterra.catalog.dto.ProductCreateDTO;
import id.alterra.catalog.dto.ProductDetailDTO;
import id.alterra.catalog.repository.ProductRepository;
import id.alterra.catalog.service.ProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service("productService")
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	
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

	@Override
	public List<Product> findProductListDetail() {
		List<Product> products = productRepository.findAll();
		return products.stream().map((b)->{
			Product dto = new Product();
			dto.setId(b.getId());
			dto.setName(b.getName());
			dto.setDescription(b.getDescription());
			dto.setSeller(b.getSeller());
			return dto;
		}).collect(Collectors.toList());
	}

	@Override
	public void createNewProduct(ProductCreateDTO dto) {
		Seller seller = new Seller();
		seller.setName(dto.getSellerName());
	
		Product product = new Product();
		product.setSeller(seller);
		product.setName(dto.getProductName());
		product.setDescription(dto.getDescription());
		productRepository.save(product);
		
	}

}

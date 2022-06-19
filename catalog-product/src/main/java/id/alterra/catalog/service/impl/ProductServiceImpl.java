package id.alterra.catalog.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import id.alterra.catalog.domain.Product;
import id.alterra.catalog.dto.ProductDetailDTO;
import id.alterra.catalog.repository.ProductRepository;
import id.alterra.catalog.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
	public List<ProductDetailDTO> findProductListDetail() {
		List<Product> products = productRepository.findAll();
		return products.stream().map((b)->{
			ProductDetailDTO dto = new ProductDetailDTO();
			dto.setHarga(1000);
			dto.setStock(10);
			dto.setProductId(1L);
			return dto;
		}).collect(Collectors.toList());
	}

}

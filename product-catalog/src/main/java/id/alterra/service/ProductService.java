package id.alterra.service;

import id.alterra.dto.ProductDetailDTO;

public interface ProductService {
	public ProductDetailDTO findProductDetailById(Long id);
}

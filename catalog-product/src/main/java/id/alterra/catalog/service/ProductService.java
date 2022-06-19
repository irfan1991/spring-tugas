package id.alterra.catalog.service;

import java.util.List;

import id.alterra.catalog.dto.ProductDetailDTO;

public interface ProductService {
	public ProductDetailDTO findProductDetailById(Long id);
	public List<ProductDetailDTO> findProductListDetail();
}

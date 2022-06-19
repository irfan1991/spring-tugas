package id.alterra.catalog.web;

import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import id.alterra.catalog.dto.ProductDetailDTO;
import id.alterra.catalog.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
public class ProductResource {

	private final ProductService productService;
	
	@GetMapping("product/{productId}")
	public ProductDetailDTO findProductDetail(@PathVariable("productId") Long id) {
		StopWatch stopWatch = new StopWatch();
		log.info("start findProductDetail "+id);
		ProductDetailDTO result = productService.findProductDetailById(id);
		log.info("finish findProductDetail. execution time = {}",stopWatch);
		return result;
	}
}

package id.alterra.catalog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import id.alterra.catalog.dto.ProductDetailDTO;
import id.alterra.catalog.service.ProductService;

@Controller
public class ProductController {

	private final ProductService productService = null ;

	@GetMapping("/list")
	public String findBookList(Model model) {
		List<ProductDetailDTO> books = productService.findProductListDetail();
		model.addAttribute("books", books);
		return "book/list";
	}
}

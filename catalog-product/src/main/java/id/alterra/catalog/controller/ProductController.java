package id.alterra.catalog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import id.alterra.catalog.domain.Product;
import id.alterra.catalog.dto.ProductCreateDTO;
import id.alterra.catalog.service.ProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/product")
public class ProductController {

	private final ProductService productService;

	@GetMapping("/list")
	public String findBookList(Model model) {
		List<Product> products = productService.findProductListDetail();
		model.addAttribute("products", products);
		return "product/list";
	}
	
	@GetMapping("/new")
	public String loadProductForm(Model model) {
		ProductCreateDTO product = new ProductCreateDTO();
		model.addAttribute("productCreateDTO", product);
		return "product/new";
	}
	

	@PostMapping("/new")
	public String addNewBook(@ModelAttribute("productCreateDTO") @Valid ProductCreateDTO dto, 
			BindingResult bindingResult,
			Errors errors,
			Model model) {
		if(errors.hasErrors()) {
			model.addAttribute("productCreateDTO", dto);
			return "product/new";
		}
		productService.createNewProduct(dto);
		return "redirect:/product/list";

	}

}

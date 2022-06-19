package id.alterra.catalog.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ProductCreateDTO {
	
	@NotBlank
	private String productName;
	
	@NotBlank
	private String sellerName;
	
	private String description;

}

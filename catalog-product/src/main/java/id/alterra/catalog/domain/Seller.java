package id.alterra.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Seller {
	@Setter
	private Long id;
	@Setter
	private String name;
	@Setter
	private Long birthDate;

}

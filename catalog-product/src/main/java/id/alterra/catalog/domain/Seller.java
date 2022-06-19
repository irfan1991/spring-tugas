package id.alterra.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Seller {
	private Long id;
	private String name;
	private Long birthDate;
}

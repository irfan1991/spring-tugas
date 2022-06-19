package id.alterra.catalog.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class Product implements Serializable {
	private static final long serialVersionUID = -3248860749851411314L;
	private Long id ;
	private String name;
	private String description;
	private Seller seller;
}

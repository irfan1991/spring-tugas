package id.alterra.catalog.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductDetailDTO implements Serializable {
	
   private static final long serialVersionUID = 1271098169665532443L;
   private Long productId;
   private int harga;
   private int stock;
   
}

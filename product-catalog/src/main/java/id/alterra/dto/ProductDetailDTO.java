package id.alterra.dto;

import java.io.Serializable;

public class ProductDetailDTO implements Serializable {
	
   private static final long serialVersionUID = 1271098169665532443L;
   private Long productId;
   private int harga;
   private int stock;
   
public Long getProductId() {
	return productId;
}
public void setProductId(Long productId) {
	this.productId = productId;
}
public int getHarga() {
	return harga;
}
public void setHarga(int harga) {
	this.harga = harga;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
@Override
public String toString() {
	return "ProductDetailDTO [productId=" + productId + ", harga=" + harga + ", stock=" + stock + "]";
}


}

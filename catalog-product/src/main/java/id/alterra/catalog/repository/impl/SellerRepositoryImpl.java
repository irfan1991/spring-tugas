package id.alterra.catalog.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import id.alterra.catalog.domain.Product;
import id.alterra.catalog.domain.Seller;
import id.alterra.catalog.repository.SellerRepository;
import lombok.Data;

@Data
public class SellerRepositoryImpl implements SellerRepository {

	private Map<Long, Seller> sellerMap;

	@Override
	public List<Seller> findAll() {
		List<Seller> sellerList = new ArrayList<Seller>(sellerMap.values());
		return sellerList;
	}

	@Override
	public Seller findSellerById(Long id) {
		Seller seller = sellerMap.get(id);
		return seller;
	}
}

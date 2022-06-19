package id.alterra.catalog.repository;

import java.util.List;

import id.alterra.catalog.domain.Seller;

public interface SellerRepository {
	public List<Seller> findAll();
	public Seller findSellerById(Long id);
}

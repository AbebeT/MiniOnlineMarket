package com.remets.miniOnlineMarket.repository;

import com.remets.miniOnlineMarket.domain.Seller;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepo extends CrudRepository<Seller, Long> {
}

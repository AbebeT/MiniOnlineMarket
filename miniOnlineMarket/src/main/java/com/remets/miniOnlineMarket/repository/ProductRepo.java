package com.remets.miniOnlineMarket.repository;

import com.remets.miniOnlineMarket.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}

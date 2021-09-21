package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Product;
import com.remets.miniOnlineMarket.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;
    @Override
    public List<Product> getAll() {
        List<Product> products =new ArrayList<>();
        productRepo.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Optional<Product> getById(Long id) {
        return productRepo.findById(id);
    }

    @Override
    public void addProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void deleteById(long id) {
        productRepo.deleteById(id);
    }
}

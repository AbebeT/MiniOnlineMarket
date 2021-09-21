package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Address;
import com.remets.miniOnlineMarket.domain.Cart;
import com.remets.miniOnlineMarket.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CartServiceImpl implements CartService {

    @Autowired
    CartRepo cartRepo;

    @Override
    public List<Cart> getAll() {
        List<Cart> carts = new ArrayList<>();
        cartRepo.findAll().forEach(cart-> carts.add((Cart)cart));
        return carts;
    }

    @Override
    public Optional<Cart> getById(Long id) {
        return cartRepo.findById(id);
    }

    @Override
    public void addCart(Cart cart) {
        cartRepo.save(cart);
    }

    @Override
    public void deleteById(long id) {
        cartRepo.deleteById(id);
    }
}

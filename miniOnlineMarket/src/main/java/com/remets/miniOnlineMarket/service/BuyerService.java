package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Buyer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BuyerService {
    public Optional<Buyer> getById(Long id);
    public List<Buyer> getAll();
    public void deleteById(Long id);
    public void addBuyer(Buyer buyer);

}

package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Buyer;
import com.remets.miniOnlineMarket.domain.Receipt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReceiptService {
    public Optional<Receipt> getById(Long id);
    public List<Receipt> getAll();
    public void deleteById(Long id);
    public void addReceipt(Receipt receipt);
}

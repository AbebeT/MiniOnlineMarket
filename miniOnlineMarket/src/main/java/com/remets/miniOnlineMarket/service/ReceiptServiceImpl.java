package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Buyer;
import com.remets.miniOnlineMarket.domain.Receipt;
import com.remets.miniOnlineMarket.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ReceiptServiceImpl implements ReceiptService{

    @Autowired
    ReceiptRepository receiptRepository;
    @Override
    public Optional<Receipt> getById(Long id) {
        return receiptRepository.findById(id);
    }

    @Override
    public List<Receipt> getAll() {
        return receiptRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        receiptRepository.deleteById(id);
    }

    @Override
    public void addReceipt(Receipt receipt) {
        receiptRepository.save(receipt);
    }
}

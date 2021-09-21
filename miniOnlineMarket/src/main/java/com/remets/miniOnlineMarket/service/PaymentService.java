package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Buyer;
import com.remets.miniOnlineMarket.domain.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PaymentService {
    public Optional<Payment> getById(Long id);
    public List<Payment> getAll();
    public void deleteById(Long id);
    public void addPayment(Payment payment);
}

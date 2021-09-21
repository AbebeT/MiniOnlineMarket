package com.remets.miniOnlineMarket.controller;

import com.remets.miniOnlineMarket.domain.Payment;
import com.remets.miniOnlineMarket.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("/payments")
    public List<Payment> getAll(){
        return paymentService.getAll();
    }

    @GetMapping("/payments/{id}")
    public Optional<Payment> getById(@PathVariable Long id) {
        return paymentService.getById(id);
    }

    @DeleteMapping("/payments/{id}")
    public void deleteById(@PathVariable Long id) {
        paymentService.deleteById(id);
    }
    @PostMapping("/payments")
    public void addPayment(@RequestBody Payment payment) {
        paymentService.addPayment(payment);
    }
//    public void printReceipt(){
//
//    }

}

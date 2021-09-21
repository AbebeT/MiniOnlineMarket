package com.remets.miniOnlineMarket.repository;

import com.remets.miniOnlineMarket.domain.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends CrudRepository <Payment, Long>{
    List<Payment> findAll();

}

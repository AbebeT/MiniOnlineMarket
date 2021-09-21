package com.remets.miniOnlineMarket.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Buyer extends Person{

    private Long id;
    private double point;
    private List<Order> orders;
    private Receipt receipt;
    private Payment payment;
    private Address billingAddress;
    private Address shippingAddress;
   // private Cart cart;


}

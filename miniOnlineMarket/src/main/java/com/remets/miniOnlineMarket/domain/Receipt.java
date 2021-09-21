package com.remets.miniOnlineMarket.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Receipt {
    private Long id;
    private String productName;
    private int quantity;
    private String buyerName;
    private double totalPrice;
    private String sellerName;
    private Date date;
    private Buyer buyer;

}

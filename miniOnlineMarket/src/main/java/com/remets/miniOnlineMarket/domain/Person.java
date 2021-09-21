package com.remets.miniOnlineMarket.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Person {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;
    public String address;
    public String role;
}
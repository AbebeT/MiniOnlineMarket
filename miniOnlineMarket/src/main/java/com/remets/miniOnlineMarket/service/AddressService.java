package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Address;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface AddressService {
    public List<Address> getAll();

    public Optional<Address> getById(Long id);

    public void addAddress(Address address);

    public void deleteById(long id);

}

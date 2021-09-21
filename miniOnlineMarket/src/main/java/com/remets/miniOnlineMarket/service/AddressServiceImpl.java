package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Address;
import com.remets.miniOnlineMarket.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    AddressRepo addressRepo;

    @Override
    public List<Address> getAll() {
    List<Address> addresses= new ArrayList<>();
    addressRepo.findAll().forEach(addresses::add);
        return addresses;
    }

    @Override
    public Optional<Address> getById(Long id) {
        return addressRepo.findById(id);
    }

    @Override
    public void addAddress(Address address) {
        addressRepo.save(address);

    }

    @Override
    public void deleteById(long id) {
        addressRepo.deleteById(id);

    }
}

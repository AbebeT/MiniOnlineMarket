package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Admin;
import com.remets.miniOnlineMarket.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepo adminRepo;

    @Override
    public List<Admin> getAll() {
        List<Admin> admins = new ArrayList<>();
        adminRepo.findAll().forEach(admins::add);
        return admins;
    }

    @Override
    public Optional<Admin> getById(Long id) {
        return adminRepo.findById(id);
    }

    @Override
    public void addAdmin(Admin admin) {
        adminRepo.save(admin);
    }

    @Override
    public void deleteById(long id) {
        adminRepo.deleteById(id);
    }
}

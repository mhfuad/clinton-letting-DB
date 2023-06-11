package com.fuad.clintonLettingDb.service;

import com.fuad.clintonLettingDb.dto.AddressRequest;
import com.fuad.clintonLettingDb.entity.Address;
import com.fuad.clintonLettingDb.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address findById(Long id) {
        return addressRepository.findById(id).orElseThrow();
    }

    public Address save(AddressRequest addressRequest) {
        Address arrdess = new Address();

    }
}

package com.fuad.clintonLettingDb.service;

import com.fuad.clintonLettingDb.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
}

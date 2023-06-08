package com.fuad.clintonLettingDb.service;

import com.fuad.clintonLettingDb.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartService {
    @Autowired
    private PartRepository partRepository;
}

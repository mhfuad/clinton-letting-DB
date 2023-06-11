package com.fuad.clintonLettingDb.service;

import com.fuad.clintonLettingDb.repository.PartUsedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartUsedService {
    @Autowired
    private PartUsedRepository partUsedRepository;
}

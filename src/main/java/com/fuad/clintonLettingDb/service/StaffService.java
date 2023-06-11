package com.fuad.clintonLettingDb.service;

import com.fuad.clintonLettingDb.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    @Autowired
    private StaffRepository staffRepository;
}

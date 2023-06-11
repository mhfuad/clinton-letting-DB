package com.fuad.clintonLettingDb.service;

import com.fuad.clintonLettingDb.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepairService {
    @Autowired
    private RepairRepository repairRepository;
}

package com.fuad.clintonLettingDb.service;

import com.fuad.clintonLettingDb.repository.TenantTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenancyService {
    @Autowired
    private TenantTypeRepository tenantTypeRepository;
}

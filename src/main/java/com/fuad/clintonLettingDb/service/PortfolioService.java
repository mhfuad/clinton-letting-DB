package com.fuad.clintonLettingDb.service;

import com.fuad.clintonLettingDb.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService {
    @Autowired
    private PortfolioRepository portfolioRepository;
}
